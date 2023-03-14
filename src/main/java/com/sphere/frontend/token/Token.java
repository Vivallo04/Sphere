package com.sphere.frontend.token;

import java.util.Arrays;

public class Token {
    private String text;
    private final TokenType type;


    public Token(String text, TokenType tokenType) {
        this.text = text;
        this.type = tokenType;
    }

    public static TokenType checkIfKeyword(String text) {
        for (TokenType kind : Arrays.stream(TokenType.values()).toList()) {
            if (kind.name().equals(text) && kind.value >= 100 && kind.value < 200) {
                return kind;
            }
        }
        return null;
    }

    public TokenType getType() {
        return type;
    }

    public String getTokenText() {
        return text;
    }

}
