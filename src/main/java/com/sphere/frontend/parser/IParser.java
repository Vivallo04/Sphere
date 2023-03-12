package com.sphere.frontend.parser;

import com.sphere.frontend.lexer.Token;

public interface IParser {
    boolean checkToken(Token kind);
    boolean checkPeek(Token kind);
    void match(Token kind);
    void nextToken();
    boolean isComparisonOperator();
    void program();
    void statement();
    void comparison();
}
