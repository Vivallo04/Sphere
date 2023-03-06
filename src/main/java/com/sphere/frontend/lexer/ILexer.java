package com.sphere.frontend.lexer;

public interface ILexer {
    void nextCharacter();

    char peek();

    void abort(String message);

    void skipWhiteSpace();

    void skipComment();

    Token getToken();
}
