package com.sphere.frontend.parser;

import com.sphere.backend.Emitter;
import com.sphere.frontend.lexer.Lexer;
import com.sphere.frontend.lexer.Token;
import com.sphere.frontend.token.TokenType;

import java.util.HashSet;


// Parser object keeps track of current token and checks if the code matches the grammar.
public class Parser implements IParser {

    private final Lexer lexer;
    private final Emitter emitter;

    private final HashSet<String> symbols;
    private final HashSet<String> labelsDeclared;
    private final HashSet<String> labelsGoto;
    private Token currentToken;
    private Token peekToken;

    public Parser(Lexer lexer, Emitter emitter) {
        this.lexer = lexer;
        this.emitter = emitter;

        symbols = new HashSet<>(); //declared variables
        labelsDeclared = new HashSet<>();
        labelsGoto = new HashSet<>();

        this.currentToken = null;
        this.peekToken = null;

        this.nextToken();
        this.nextToken(); // Call this twice to initialize current and peek.
    }

    // Return true if the current token matches.
    public boolean checkToken(TokenType kind) {
        return kind == currentToken.getType();
    }

    // Return true if the next token matches.
    public boolean checkPeek(TokenType kind) {
        return kind == peekToken.getType();
    }

    // Try to match current token. If not, error. Advances the current token.
    public void match(TokenType kind) {
        if (!checkToken(kind)) {
            abort("Expected " + kind.getClass().getName() + ", got " + currentToken.getType().name());
        }
        nextToken();
    }

    // Advances the current token.
    public void nextToken() {
        currentToken = peekToken;
        peekToken = lexer.getToken();
        // No need to worry about passing the EOF, lexer handles that.
    }

    // Return true if the current token is a comparison operator.
    public boolean isComparisonOperator() {
        return checkToken(TokenType.GT) || checkToken(TokenType.GTEQ) || checkToken(TokenType.LT) || checkToken(TokenType.LTEQ) || checkToken(TokenType.EQEQ) || checkToken(TokenType.NOTEQ);
    }

    public void abort(String message) {
        System.out.println(message);
        System.exit(2);
    }

    // Production rules.

    // program ::= {statement}
    public void program() {
        System.out.println("PROGRAM");

        this.emitter.headerLine("#include <stdio.h>");
        this.emitter.headerLine("int main(void) {");

        // Since some newlines are required in our grammar, need to skip the excess.
        while (checkToken(TokenType.NEWLINE)) {
            nextToken();
        }

        // Parse all the statements in the program.
        while (!checkToken(TokenType.EOF)) {
            statement();
        }

        this.emitter.emitLine("return 0;");
        this.emitter.emitLine("}");

        // Check that each label referenced in a GOTO is declared.
        for (String label : labelsGoto) {
            if (!labelsDeclared.contains(label)) {
                abort("Attempting to GOTO to undeclared label: " + label);
            }
        }
    }

    // One of the following statements...
    public void statement() {
        // Check the first token to see what kind of statement this is.

        // "PRINT" (expression | string)
        if (checkToken(TokenType.PRINT)) {
            System.out.println("STATEMENT-PRINT");
            this.nextToken();

            if (checkToken(TokenType.STRING)) {
                // Simple string.
                this.emitter.emitLine("printf(\"" + this.currentToken.getTokenString() + "\\n\");");
                this.nextToken();

            } else {
                // Expect an expression.
                this.emitter.emit("printf(\"%" + ".2f\\n\", (float)(");
                this.expression();
                this.emitter.emitLine("));");
            }
        }

        // "IF" comparison "THEN" {statement} "ENDIF"
        else if (checkToken(TokenType.IF)) {
            System.out.println("STATEMENT-IF");
            this.nextToken();
            emitter.emit("if(");
            this.comparison();

            this.match(TokenType.THEN);
            this.newLine();
            emitter.emitLine("){");

            // Zero or more statements in the body.
            while (!checkToken(TokenType.ENDIF)) {
                this.statement();
            }

            this.match(TokenType.ENDIF);
            emitter.emitLine("}");
        }

        // "WHILE" comparison "REPEAT" {statement} "ENDWHILE"
        else if (checkToken(TokenType.WHILE)) {
            System.out.println("STATEMENT-WHILE");
            this.nextToken();
            emitter.emit("while(");
            this.comparison();

            this.match(TokenType.REPEAT);
            this.newLine();
            this.emitter.emitLine("){");

            while (!this.checkToken(TokenType.ENDWHILE)) {
                this.statement();
            }
            this.match(TokenType.ENDWHILE);
            emitter.emitLine("}");
        }

        // "LABEL" ident
        else if (this.checkToken(TokenType.LABEL)) {
            System.out.println("STATEMENT-LABEL");
            this.nextToken();

            // Make sure this label doesn't already exist
            if (labelsDeclared.contains(this.currentToken.getTokenString())) {
                abort("Label already exists: " + this.currentToken.getTokenText());
            }

            this.labelsDeclared.add(this.currentToken.getTokenString());
            emitter.emitLine(this.currentToken.getTokenString() + ":");
            match(TokenType.IDENT);

        } else if (this.checkToken(TokenType.GOTO)) {
            System.out.println("STATEMENT-GOTO");
            this.nextToken();
            this.labelsGoto.add(this.currentToken.getTokenString());
            emitter.emitLine("goto " + currentToken.getTokenString() + ";");
            match(TokenType.IDENT);

        } else if (this.checkToken(TokenType.LET)) {
            System.out.println("STATEMENT-LET");
            this.nextToken();

            // Check if ident exists in symbol table. If not, declare it
            if (!symbols.contains(this.currentToken.getTokenString())) {
                symbols.add(this.currentToken.getTokenString());
                emitter.headerLine("float" + currentToken.getTokenString() + ";");
            }

            emitter.emit(this.currentToken.getTokenString() + " = ");
            this.match(TokenType.IDENT);
            this.match(TokenType.EQ);

            this.expression();
            emitter.emitLine(";");

        } else if (this.checkToken(TokenType.INPUT)) {
            System.out.println("STATEMENT-INPUT");
            this.nextToken();

            // If variable doesn't already exist, declare it
            if (!symbols.contains(this.currentToken.getTokenString())) {
                symbols.add(this.currentToken.getTokenString());
                emitter.headerLine("float " + this.currentToken.getTokenString() + ";");
            }

            // Emit scanf but also validate the input. If invalid, set the variable to 0 and clear the input.
            emitter.emitLine("if(0 == scanf(\"%" + "f\", &" + this.currentToken.getTokenString() + ")) {");
            emitter.emitLine(this.currentToken.getTokenString() + " = 0;");
            emitter.emit("scanf(\"%");
            emitter.emitLine("*s\");");
            emitter.emitLine("}");
            this.match(TokenType.IDENT);
        } else {
            abort("Invalid statement at: " + this.currentToken.getTokenString() + "(" + this.currentToken.getType().name() + ")");
        }

        // Newline
        this.newLine();
    }

    // comparison ::= expression (("==" | "!=" | ">" | ">=" | "<" | "<=") expression)+
    @Override
    public void comparison() {
        System.out.println("Comparison");
        this.expression();

        if (this.isComparisonOperator()) {
            emitter.emit(this.currentToken.getTokenString());
            this.nextToken();
            this.expression();
        } else {
            abort("Expected comparison operator at: " + this.currentToken.getTokenText());
        }

        while (this.isComparisonOperator()) {
            emitter.emit(this.currentToken.getTokenString());
            this.nextToken();
            this.expression();
        }
    }

    // expression ::= term {( "-" | "+" ) term}
    public void expression() {
        System.out.println("Expression");
        this.term();

        // Can have 0 or more +/- and expressions
        while (this.checkToken(TokenType.PLUS) || this.checkPeek(TokenType.MINUS)) {
            emitter.emit(this.currentToken.getTokenString());
            this.nextToken();
            this.term();
        }
    }

    // term ::= unary {( "/" | "*" ) unary}
    public void term() {
        System.out.println("Term");
        this.unary();

        // Can have 0 or more *// and expressions.
        while (this.checkToken(TokenType.ASTERISK) || this.checkToken(TokenType.SLASH)) {
            emitter.emit(this.currentToken.getTokenString());
            this.nextToken();
            this.unary();
        }
    }

    // unary ::= ["+" | "-"] primary
    public void unary() {
        System.out.println("Unary");

        // optional unary +/-
        if (this.checkToken(TokenType.PLUS) || this.checkToken(TokenType.MINUS)) {
            emitter.emit(this.currentToken.getTokenString());
            this.nextToken();
        }
        this.primary();
    }

    public void primary() {
        System.out.println("Primary (" + this.currentToken.getTokenString() + ")");

        if (this.checkToken(TokenType.NUMBER)) {
            emitter.emit(this.currentToken.getTokenString());
            this.nextToken();
        } else if (this.checkToken(TokenType.IDENT)) {

            // Ensure the variable already exists
            if (!this.symbols.contains(this.currentToken.getTokenString())) {
                abort("Referencing a variable before assignment: " + this.currentToken.getTokenString());
            }

            emitter.emit(this.currentToken.getTokenString());
            this.nextToken();
        } else {
            // Error!
            abort("Unexpected token at " + this.currentToken.getTokenString());
        }
    }

    // n1 ::= '\n'
    public void newLine() {
        System.out.println("New line");

        // Require at least one newline
        this.match(TokenType.NEWLINE);

        // But we will allow extra newlines too
        while (this.checkToken(TokenType.NEWLINE)) {
            this.nextToken();
        }
    }
}
