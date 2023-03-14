package com.sphere.frontend.lexer;

import com.sphere.frontend.token.Token;

public interface ILexer {

    void nextCharacter();

    char peek();

    void abort(String message);

    void skipWhiteSpace();

    void skipComment();

    Token getToken();
}
