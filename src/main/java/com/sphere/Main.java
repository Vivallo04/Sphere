package com.sphere;

import com.sphere.backend.Emitter;
import com.sphere.frontend.lexer.Lexer;
import com.sphere.frontend.parser.Parser;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Crypton Compiler Started...\n");

        String source = readInputFile(args);

        Lexer lexer = new Lexer(source);
        Emitter emitter = new Emitter("src/main/resources/out.c");
        Parser parser = new Parser(lexer, emitter);

        parser.program();
        emitter.writeFile();


        System.out.println("Compiling completed!");
    }

    private static String readInputFile(String[] args) {
        if (args.length != 1) {
            System.err.println("Error: Compiler needs source file as argument.");
            System.exit(1);
        }

        StringBuilder input = new StringBuilder();
        try {
            File file = new File(args[0]);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                input.append(scanner.nextLine()).append("\n");
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        System.out.println(input);
        return String.valueOf(input);
    }
}