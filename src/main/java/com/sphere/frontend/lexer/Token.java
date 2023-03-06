package com.sphere.frontend.lexer;

import com.sphere.frontend.token.TokenType;

public class Token {

    private char tokenText;
    private String tokenString;
    private final TokenType type;


    public Token(char tokenText, TokenType tokenType) {
        this.tokenText = tokenText;
        this.type = tokenType;
    }

    public Token(String tokenString, TokenType tokenType) {
        this.tokenString = tokenString;
        this.type = tokenType;
    }

    public TokenType getType() {
        return type;
    }

    public static TokenType checkIfKeyword(String tokenText) {
        for (TokenType kind : TokenType.values()) {
            // Relies on all keyword enum values being 1XX.
            /* if (kind.name().equals(tokenText) && kind == "" && kind.value() < 200) {
                return kind;
            }*/
        }
        return null;
    }

}
