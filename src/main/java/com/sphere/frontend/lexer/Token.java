package com.sphere.frontend.lexer;

import com.sphere.frontend.token.TokenType;

import java.util.Arrays;

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
        for (TokenType kind : Arrays.stream(TokenType.values()).toList()) {
            if (kind.name().equals(tokenText) && kind.value >= 100 && kind.value < 200) {
                return kind;
            }
        }
        return null;
    }

}
