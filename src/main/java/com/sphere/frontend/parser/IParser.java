package com.sphere.frontend.parser;

import com.sphere.frontend.token.TokenType;

public interface IParser {
    boolean checkToken(TokenType kind);
    boolean checkPeek(TokenType kind);
    void match(TokenType kind);
    void nextToken();
    boolean isComparisonOperator();
    void program();
    void statement();
    void comparison();
}
