package com.sphere;

import com.sphere.frontend.lexer.Lexer;
import com.sphere.frontend.lexer.Token;
import com.sphere.frontend.token.TokenType;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String source = "+- */ >>= = !=";

        Lexer lexer = new Lexer(source);
        Token token = lexer.getToken();

        while (token.getType() != TokenType.EOF) {
            System.out.println(token.getType());
            token = lexer.getToken();
        }
    }
}