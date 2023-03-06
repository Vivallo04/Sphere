package com.sphere.frontend.lexer;

import com.sphere.frontend.token.TokenType;

public class Token {

    private char tokenText;
    private final TokenType type;


    public Token(char tokenText, TokenType tokenType) {
        this.tokenText = tokenText;
        this.type = tokenType;
    }

    public TokenType getType() {
        return type;
    }
}
