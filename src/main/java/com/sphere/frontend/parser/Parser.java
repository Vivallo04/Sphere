package com.sphere.frontend.parser;

import com.sphere.backend.Emitter;
import com.sphere.frontend.lexer.Lexer;
import com.sphere.frontend.token.Token;
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
            abort("Expected " + kind + ", got " + currentToken.getType().name());
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
        return checkToken(TokenType.GT) || checkToken(TokenType.GTEQ) || checkToken(TokenType.LT) ||
                checkToken(TokenType.LTEQ) || checkToken(TokenType.EQEQ) || checkToken(TokenType.NOTEQ);
    }

    public void abort(String message) {
        System.out.println(message);
        System.exit(2);
    }

    // Production rules.

    // program ::= {statement}
    public void program() {

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
            this.nextToken();

            if (checkToken(TokenType.STRING)) {
                // Simple string.
                this.emitter.emitLine("printf(\"" + this.currentToken.getTokenText() + "\\n\");");
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
        else if (checkToken(TokenType.LABEL)) {
            this.nextToken();

            // Make sure this label doesn't already exist
            if (labelsDeclared.contains(this.currentToken.getTokenText())) {
                abort("Label already exists: " + this.currentToken.getTokenText());
            }

            this.labelsDeclared.add(this.currentToken.getTokenText());
            emitter.emitLine(this.currentToken.getTokenText() + ":");
            match(TokenType.IDENT);

        } else if (this.checkToken(TokenType.GOTO)) {
            this.nextToken();
            this.labelsGoto.add(this.currentToken.getTokenText());
            emitter.emitLine("goto " + currentToken.getTokenText() + ";");
            match(TokenType.IDENT);

        } else if (this.checkToken(TokenType.LET)) {
            this.nextToken();

            // Check if ident exists in symbol table. If not, declare it
            if (!symbols.contains(this.currentToken.getTokenText())) {
                symbols.add(this.currentToken.getTokenText());
                emitter.headerLine("float" + currentToken.getTokenText() + ";");
            }

            emitter.emit(this.currentToken.getTokenText() + " = ");
            this.match(TokenType.IDENT);
            this.match(TokenType.EQ);

            this.expression();
            emitter.emitLine(";");

        } else if (checkToken(TokenType.INPUT)) {
            this.nextToken();

            // If variable doesn't already exist, declare it
            if (!symbols.contains(this.currentToken.getTokenText())) {
                symbols.add(this.currentToken.getTokenText());
                emitter.headerLine("float " + this.currentToken.getTokenText() + ";");
            }

            // Emit scanf but also validate the input. If invalid, set the variable to 0 and clear the input.
            emitter.emitLine("if(0 == scanf(\"%" + "f\", &" + this.currentToken.getTokenText() + ")) {");
            emitter.emitLine(this.currentToken.getTokenText() + " = 0;");
            emitter.emit("scanf(\"%");
            emitter.emitLine("*s\");");
            emitter.emitLine("}");
            this.match(TokenType.IDENT);
        } else {
            abort("Invalid statement at: " + this.currentToken.getTokenText() + "(" + this.currentToken.getType().name() + ")");
        }

        // Newline
        this.newLine();
    }

    // comparison ::= expression (("==" | "!=" | ">" | ">=" | "<" | "<=") expression)+
    @Override
    public void comparison() {
        this.expression();

        // Must be at least one comparison operator and another expression.
        if (this.isComparisonOperator()) {
            emitter.emit(this.currentToken.getTokenText());
            this.nextToken();
            this.expression();
        }

        // Can have 0 or more comparison operator and expressions.
        while (this.isComparisonOperator()) {
            emitter.emit(this.currentToken.getTokenText());
            this.nextToken();
            this.expression();
        }
    }

    // expression ::= term {( "-" | "+" ) term}
    public void expression() {
        this.term();

        // Can have 0 or more +/- and expressions
        while (checkToken(TokenType.PLUS) || checkPeek(TokenType.MINUS)) {
            emitter.emit(this.currentToken.getTokenText());
            this.nextToken();
            this.term();
        }
    }

    // term ::= unary {( "/" | "*" ) unary}
    public void term() {
        this.unary();

        // Can have 0 or more *// and expressions.
        while (this.checkToken(TokenType.ASTERISK) || this.checkToken(TokenType.SLASH)) {
            emitter.emit(this.currentToken.getTokenText());
            this.nextToken();
            this.unary();
        }
    }

    // unary ::= ["+" | "-"] primary
    public void unary() {
        // optional unary +/-
        if (this.checkToken(TokenType.PLUS) || this.checkToken(TokenType.MINUS)) {
            emitter.emit(this.currentToken.getTokenText());
            this.nextToken();
        }
        this.primary();
    }

    public void primary() {
        System.out.println("Primary (" + this.currentToken.getTokenText() + ")");

        if (this.checkToken(TokenType.NUMBER)) {
            emitter.emit(this.currentToken.getTokenText());
            this.nextToken();

        } else if (this.checkToken(TokenType.IDENT)) {

            // Ensure the variable already exists
            if (!this.symbols.contains(this.currentToken.getTokenText())) {
                abort("Referencing a variable before assignment: " + this.currentToken.getTokenText());
            }

            emitter.emit(this.currentToken.getTokenText());
            this.nextToken();
        } else {
            // Error!
            abort("Unexpected token at " + this.currentToken.getTokenText());
        }
    }

    // n1 ::= '\n'
    public void newLine() {
        // Require at least one newline
        this.match(TokenType.NEWLINE);

        // But we will allow extra newlines too
        while (this.checkToken(TokenType.NEWLINE)) {
            this.nextToken();
        }
    }
}
