package com.sphere;

import com.sphere.frontend.lexer.Lexer;
import com.sphere.frontend.parser.Parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Crypton Compiler");
        String source = "IF+-123 foo*THEN/";

        readInputFile(args, source);

        Lexer lexer = new Lexer(source);
        Parser parser = new Parser(lexer);

        parser.program();

        System.out.println("Parsing completed");
    }

    private static void readInputFile(String[] args, String source) {
        if (args.length != 1) {
            System.out.println("Error: Compiler needs source file as argument.");
            System.exit(1);
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            String line;
            StringBuilder sourceBuilder = new StringBuilder(source);
            while ((line = reader.readLine()) != null) {
                sourceBuilder.append(line).append("\n");
            }
            source = sourceBuilder.toString();
            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            System.exit(1);
        }
    }
}