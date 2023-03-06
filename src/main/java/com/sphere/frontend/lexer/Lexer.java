package com.sphere.frontend.lexer;

import com.sphere.frontend.token.TokenType;

public class Lexer implements ILexer {
    public final String source;
    private char currentCharacter;
    private int currentPosition;
    public Lexer(String source) {
        this.source = source;
        this.currentCharacter = ' ';
        this.currentPosition = -1;
        this.nextCharacter();
    }

    @Override
    public void nextCharacter() {
        this.currentPosition += 1;
        if (this.currentPosition >= this.source.length()) {
            this.currentCharacter = '\0';
        } else {
            this.currentCharacter = this.source.charAt(this.currentPosition);
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
        while(this.currentCharacter  == ' ' || this.currentCharacter == '\t' || this.currentCharacter == '\r') {
            nextCharacter();
        }
    }

    @Override
    public void skipComment() {
        if (currentCharacter == '#') {
            while (currentCharacter != '\n') {
                nextCharacter();
            }
        }
    }

    @Override
    public Token getToken() {
        skipWhiteSpace();
        skipComment();
        Token token = null;
        if (this.currentCharacter == '+') {
            token = new Token(this.currentCharacter, TokenType.PLUS);
        } else if (this.currentCharacter == '-') {
            token  = new Token(this.currentCharacter, TokenType.MINUS);
        } else if (this.currentCharacter == '*') {
            token  = new Token(this.currentCharacter, TokenType.ASTERISK);
        } else if (this.currentCharacter == '/') {
            token  = new Token(this.currentCharacter, TokenType.SLASH);
        } else if (this.currentCharacter == '=') {
            if (peek() == '=') {
                char lastCharacter = this.currentCharacter;
                nextCharacter();
                token = new Token((char) (lastCharacter + currentCharacter), TokenType.EQEQ);
            } else {
                token = new Token(currentCharacter, TokenType.EQ);
            }
        } else if (this.currentCharacter == '>') {
            if (peek() == '=') {
                char lastCharacter = this.currentCharacter;
                nextCharacter();
                token = new Token((char) (lastCharacter + currentCharacter), TokenType.GTEQ);
            } else {
                token = new Token(currentCharacter, TokenType.GT);
            }
        } else if (this.currentCharacter == '<') {
            if (peek() == '=') {
                char lastCharacter = this.currentCharacter;
                nextCharacter();
                token = new Token((char) (lastCharacter + currentCharacter), TokenType.LTEQ);
            } else {
                token = new Token(currentCharacter, TokenType.LT);
            }

        } else if (this.currentCharacter == '!') {
            if (peek() == '=') {
                char lastCharacter = this.currentCharacter;
                nextCharacter();
                token = new Token((char) (lastCharacter + currentCharacter), TokenType.NOTEQ);
            } else {
                abort("Expected !=. But got !" + peek());
            }

        } else if (this.currentCharacter == '\n') {
            token  = new Token(this.currentCharacter, TokenType.NEWLINE);
        } else if (this.currentCharacter == '\0') {
            token  = new Token(this.currentCharacter, TokenType.EOF);
        } else {
            // Unknown token
            abort(this.getClass().getName() + " Unknown token: " + this.currentCharacter);
        }
        this.nextCharacter();
        return token;
    }

    public char getCurrentCharacter() {
        return currentCharacter;
    }

    public void setCurrentCharacter(char currentCharacter) {
        this.currentCharacter = currentCharacter;
    }
}
