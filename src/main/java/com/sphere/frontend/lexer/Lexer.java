package com.sphere.frontend.lexer;

import com.sphere.frontend.token.Token;
import com.sphere.frontend.token.TokenType;
import com.sphere.util.Utils;

public class Lexer implements ILexer {

    public final String source;
    private String currentCharacter;
    private int currentPosition;

    public Lexer(String source) {
        this.source = source + '\n';
        this.currentCharacter = "";
        this.currentPosition = -1;
        this.nextCharacter();
    }

    /***
     * Process the next character
     */
    @Override
    public void nextCharacter() {
        this.currentPosition += 1;
        if (currentPosition >= source.length()) {
            currentCharacter = String.valueOf('\0'); // EOF
        } else {
            currentCharacter = String.valueOf(this.source.charAt(this.currentPosition));
        }
    }

    @Override
    public char peek() {
        if (this.currentPosition + 1 >= this.source.length()) {
            return '\0';
        }
        return this.source.charAt(this.currentPosition + 1);
    }

    @Override
    public void abort(String message) {
        System.out.println(message);
        System.exit(2);
    }

    @Override
    public void skipWhiteSpace() {
        while (currentCharacter.equals(String.valueOf(' ')) ||
                currentCharacter.equals(String.valueOf('\t')) ||
                currentCharacter.equals(String.valueOf('\r'))) {
            nextCharacter();
        }
    }

    @Override
    public void skipComment() {
        if (currentCharacter.equals(String.valueOf('#'))) {
            while (!currentCharacter.equals(String.valueOf('\n'))) {
                nextCharacter();
            }
        }
    }

    @Override
    public Token getToken() {
        skipWhiteSpace();
        skipComment();
        Token token = null;

        if (currentCharacter.equals(String.valueOf('+'))) {
            token = new Token(this.currentCharacter, TokenType.PLUS);

        } else if (currentCharacter.equals(String.valueOf('-'))) {
            token = new Token(this.currentCharacter, TokenType.MINUS);

        } else if (currentCharacter.equals(String.valueOf('*'))) {
            token = new Token(this.currentCharacter, TokenType.ASTERISK);

        } else if (currentCharacter.equals(String.valueOf('/'))) {
            token = new Token(this.currentCharacter, TokenType.SLASH);

        } else if (currentCharacter.equals(String.valueOf('='))) {
            if (peek() == '=') {
                String lastCharacter = this.currentCharacter;
                nextCharacter();
                token = new Token(lastCharacter + currentCharacter, TokenType.EQEQ);
            } else {
                token = new Token(currentCharacter, TokenType.EQ);
            }

        } else if (currentCharacter.equals(String.valueOf('>'))) {
            if (peek() == '=') {
                String lastCharacter = this.currentCharacter;
                nextCharacter();
                token = new Token(lastCharacter + currentCharacter, TokenType.GTEQ);
            } else {
                token = new Token(currentCharacter, TokenType.GT);
            }

        } else if (currentCharacter.equals(String.valueOf('<'))) {
            if (peek() == '=') {
                String lastCharacter = this.currentCharacter;
                nextCharacter();
                token = new Token(lastCharacter + currentCharacter, TokenType.LTEQ);
            } else {
                token = new Token(currentCharacter, TokenType.LT);
            }

        } else if (currentCharacter.equals(String.valueOf('!'))) {
            if (peek() == '=') {
                String lastCharacter = this.currentCharacter;
                nextCharacter();
                token = new Token(lastCharacter + currentCharacter, TokenType.NOTEQ);
            } else {
                abort("Expected !=. But got !" + peek());
            }

        } else if (currentCharacter.equals(String.valueOf('\"'))) {
            // Get the characters between the quotations
            nextCharacter();
            int startPosition = currentPosition;

            while (!currentCharacter.equals(String.valueOf('\"'))) {
                if (currentCharacter.equals(String.valueOf('\r')) ||
                        currentCharacter.equals(String.valueOf('\n')) ||
                        currentCharacter.equals(String.valueOf('\t')) ||
                        currentCharacter.equals(String.valueOf('\\')) ||
                        currentCharacter.equals(String.valueOf('%'))) {
                    abort("Illegal character in the string");
                }
                nextCharacter();
            }

            String tokenText = this.source.substring(startPosition, currentPosition);
            token = new Token(tokenText, TokenType.STRING);

        } else if (Utils.isDigit(currentCharacter)) {
            int startPosition = currentPosition;

            while (Character.isDigit(peek())) {
                nextCharacter();
            }
            // Is DECIMAL
            if (peek() == '.') {
                nextCharacter();
                if (!Character.isDigit(peek())) {
                    abort("Illegal character in the number");
                }
                while (Character.isDigit(peek())) {
                    nextCharacter();
                }
            }
            String tokenText = this.source.substring(startPosition, currentPosition + 1);
            token = new Token(tokenText, TokenType.NUMBER);

        } else if (Utils.isAlphabetic(currentCharacter)) {
            int startPosition = currentPosition;

            while (Utils.isAlphanumeric(currentCharacter)) {
                nextCharacter();
            }

            String tokenText = this.source.substring(startPosition, currentPosition);
            TokenType keyword = Token.checkIfKeyword(tokenText);
            if (keyword == null) {
                // Identifier
                token = new Token(tokenText, TokenType.IDENT);
            } else {
                // Keyword
                token = new Token(tokenText, keyword);
            }

        } else if (currentCharacter.equals(System.lineSeparator())) {
            // Newline
            token = new Token(String.valueOf('\n'), TokenType.NEWLINE);

        } else if (currentCharacter.equals(String.valueOf('\0'))) {
            // EOF
            token = new Token(String.valueOf(' '), TokenType.NEWLINE);

        } else {
            // Unknown token
            token = new Token(String.valueOf(' '), TokenType.EOF);
        }
        this.nextCharacter();
        return token;
    }

    public String getCurrentCharacter() {
        return currentCharacter;
    }

    public void setCurrentCharacter(char currentCharacter) {
        this.currentCharacter = String.valueOf(currentCharacter);
    }
}
