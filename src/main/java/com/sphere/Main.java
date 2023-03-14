package com.sphere;

import com.sphere.backend.Emitter;
import com.sphere.frontend.lexer.Lexer;
import com.sphere.frontend.parser.Parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Crypton Compiler");

        String source = readInputFile(args);

        Lexer lexer = new Lexer(source);
        Emitter emitter = new Emitter("out.c");
        Parser parser = new Parser(lexer, emitter);

        parser.program();
        emitter.writeFile();

        System.out.println("Compiling completed");
    }

    private static String readInputFile(String[] args) {
        if (args.length != 1) {
            System.err.println("Error: Compiler needs source file as argument.");
            System.exit(1);
        }

        String filename = args[0];
        StringBuilder source = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine();
            while (line != null) {
                source.append(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            System.exit(1);
        }
        return source.toString();
    }
}