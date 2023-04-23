package com.sphere;

import com.sphere.backend.ArduinoCodeGenerator;
import com.sphere.frontend.lexer.SphereLexer;
import com.sphere.frontend.parser.SphereParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String @NotNull [] args) throws IOException {
        System.out.println("Compiler started");
        System.out.println("File: " + args[0] + "\n");
        String input = readFile(args);
    
        var lexer = new SphereLexer(CharStreams.fromString(input));
        var tokens = new CommonTokenStream(lexer);
        var parser = new SphereParser(tokens);

        // Parse the input to create the parse tree
        ParseTree tree = parser.start();

        System.out.println("Parse tree:");
        System.out.println(tree.toStringTree(parser) + "\n");

        // Walk the AST and generate Arduino code
        var codeGenerator = new ArduinoCodeGenerator();
        var arduinoCode = codeGenerator.visit(tree);

        codeGenerator.getWriter().close();
    }

    public static String readFile(@org.jetbrains.annotations.NotNull String[] args) {
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