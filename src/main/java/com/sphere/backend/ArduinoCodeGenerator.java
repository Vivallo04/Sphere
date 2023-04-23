package com.sphere.backend;

import com.sphere.frontend.parser.SphereParser;
import com.sphere.frontend.visitor.SphereBaseVisitor;
import com.sphere.util.Utils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class ArduinoCodeGenerator extends SphereBaseVisitor<String> {
    private final Map<String, Object> variables = new HashMap<>();
    private final Stack<String> functionCallStack = new Stack<>();
    private final FileWriter writer;

    public ArduinoCodeGenerator() throws IOException {
        final String outputFilePath = "output.ino";
        this.writer = new FileWriter("src/main/resources/" + outputFilePath, false);
    }

     /**
     * Visit a parse tree produced by {@link SphereParser#assignment}.
     * Code to be executed when an assignment is found
     * Example: Def(@dog, (integer | boolean | string), (1 | True | "dog"));
     * Produces: int dog = 1;
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitAssignment(SphereParser.AssignmentContext ctx) {
        if (!validateVariableTypeAndValue(ctx)) {
            throw new RuntimeException("Invalid variable type and value");
        }

        String variableName = ctx.variable().ID().getText();
        String variableType = ctx.type().getText();
        Object variableValue = resolveVariableValue(ctx);

        variables.put(variableName, variableValue);
        writeVariableDefinitions(variableName, variableType, variableValue);
        return variableName + " = " + variableValue + ";\n";
    }

    private boolean validateVariableTypeAndValue(SphereParser.AssignmentContext ctx) {
        boolean hasTypeButNoValueInteger = ctx.type().getText().equals("integer") && ctx.constant() == null;
        boolean hasTypeButNoValueBoolean = ctx.type().getText().equals("boolean") && ctx.constant() == null;
        boolean hasTypeButNoValueString = ctx.type().getText().equals("string") && ctx.constant() == null;

        if (hasTypeButNoValueInteger || ctx.type().getText().equals("integer") &&
                Utils.isNumeric(ctx.constant().getText())) {
            return true;

        } else if (hasTypeButNoValueBoolean ||ctx.type().getText().equals("boolean") &&
                Utils.isBoolean(ctx.constant().getText())) {
            return true;

        } else return (hasTypeButNoValueString || ctx.type().getText().equals("string") &&
                Utils.isEnclosedInQuotes(ctx.constant().getText()));
    }

    public String setArduinoVariableType(String variableType) {
        switch (variableType) {
            case "integer" -> variableType = "int";
            case "boolean" -> variableType = "bool";
            case "string" -> variableType = "String";
        }
        return variableType;
    }

    private Object resolveVariableValue(SphereParser.AssignmentContext ctx) {
        if (ctx.constant() == null) {
            return null;
        }

        switch (ctx.type().getText()) {
            case "integer" -> {
                return Integer.parseInt(ctx.constant().getText());
            }
            case "boolean" -> {
                return Boolean.parseBoolean(ctx.constant().getText());
            }
            case "string" -> {
                return ctx.constant().getText();
            }
        }
        return null;
    }

    private void writeVariableDefinitions(String variableName, String variableType, Object variableValue) {
        try {
            variableType = setArduinoVariableType(variableType);

            String arduinoVariable;
            if (variableValue == null) {
                arduinoVariable = variableType + " " + variableName + ";\n";
            } else {
                arduinoVariable = variableType + " " + variableName + " = " + variableValue + ";\n";
            }

            this.writer.write(arduinoVariable);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Visit a parse tree produced by {@link SphereParser#print}.
     * Code to be executed when a =>(); is found
     * Example: =>(@dog);
     * Produces: Serial.println(dog);
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitPrint(SphereParser.PrintContext ctx) {
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getText().equals("(")) {
                // Remove the @ sign from the variable name
                String variableName = ctx.children.get(i + 1).getText().replace("@", "");
                if (ctx.children.get(i + 1).getText().startsWith("@") && variables.containsKey(variableName)) {
                    writePrint(variableName);

                } else if (Utils.isBoolean(ctx.children.get(i + 1).getText()) ||
                        Utils.isNumeric(ctx.children.get(i + 1).getText()) ||
                        Utils.isEnclosedInQuotes(ctx.children.get(i + 1).getText())) {
                    writePrint(ctx.children.get(i + 1).getText());

                } else {
                    throw new RuntimeException("Invalid statement in print function, " +
                            "variable does not exist or is not a valid type");
                }
            }
        }
        return "";
    }

    private void writePrint(String printExpression) {
        try {
            this.writer.write("Serial.println(" + printExpression + ");\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Visit a parse tree produced by {@link SphereParser#line}.
     * Code to be executed when a line is found
     * Example: @dog = 2;
     * Produces: dog = 2;
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitProgram(SphereParser.ProgramContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("#include <Arduino.h>\n\n");
        sb.append("void setup() {\n");
        sb.append(visit(ctx.line(0)));
        sb.append("}\n\n");
        sb.append("void loop() {\n");
        //sb.append(visit(ctx.parent);
        sb.append("}\n");

        try {
            writer.write(sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    /***
     * Visit a parse tree produced by {@link SphereParser#reAssignment()}.
     * Code to be executed when a reassignment is found
     * Example: @dog = 2;
     * Produces: dog = 2;
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitReAssignment(SphereParser.ReAssignmentContext ctx) {
        var variableName = ctx.ID().get(0).getText();
        if (!variables.containsKey(variableName)) {
            throw new RuntimeException("Variable " + variableName + " not found");
        }

        variables.put(variableName, ctx.constant().getText());
        writeVariableReassignment(variableName, ctx.constant().getText().toLowerCase());
        return super.visitReAssignment(ctx);
    }

    public void writeVariableReassignment(String variableName, String variableValue) {
        try {
            String arduinoVariable = variableName + " = " + variableValue + ";\n";
            this.writer.write(arduinoVariable);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String visitVariable(SphereParser.VariableContext ctx) {
        var variableName = ctx.ID().getText();
        if (variables.containsKey(variableName)) {
            return variables.get(ctx.ID().getText()).toString();
        }
        return ctx.ID().getText();
    }

    /**
     * Visit a parse tree produced by {@link SphereParser#proc}.
     * Code to be executed when a function is found
     * Example: Proc @hello( --code );
     * Produces: void hello() { //code }
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitProc(SphereParser.ProcContext ctx) {
        var functionName = ctx.ID().getText();
        if (functionCallStack.contains(functionName)) {
            throw new RuntimeException("Recursive function call not allowed");
        }

        functionCallStack.push(functionName);
        var functionBody = visit(ctx.block());

        writeFunction(functionName);
        return super.visitProc(ctx);
    }

    public void writeFunction(String functionName) {
        try {
            String arduinoFunction = "void " + functionName + "() {\n" +  "}\n";
            this.writer.write(arduinoFunction);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Visit a parse tree produced by {@link SphereParser#mainFunction}.
     * Code to be executed when the main function is found
     * Example: @Principal( --code );
     * Produces: void setup() { //code }
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitMainFunction(SphereParser.MainFunctionContext ctx) {
        var functionName = ctx.Principal().getText();
        if (functionCallStack.contains(functionName)) {
            throw new RuntimeException("Recursive function call not allowed");
        }

        writePrincipalFunction();
        functionCallStack.push(functionName);

        return "";
    }

    public void writePrincipalFunction() {
        try {
            String arduinoFunction = """
                    void setup() {
                    
                    }
                    """;
            this.writer.write(arduinoFunction);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // TODO: Generate an error if @Principal is not found, or if there are more than one @Principal
    // TODO: Not function
    // TODO: Mover
    // TODO: Aleatorio
    // TODO: Conditionals
    // TODO: IsTrue
    // TODO: Repeat
    // TODO: Until
    // TODO: Case
    // TODO: Case when


    @Override
    public String visitAlterFunction(SphereParser.AlterFunctionContext ctx) {
        if (ctx.children.size() == 1) {
            return "";
        }

        var varName = ctx.variable().get(0).getText();
        if (!variables.containsKey(varName)) {
            throw new RuntimeException("Variable " + varName + " not found");
        }

        var variableValue = ctx.variable().get(1).getText();
        if (variableValue.contains("@") && !variables.containsKey(variableValue)) {
            throw new RuntimeException("Variable " + variableValue + " not found");
        }

        int currentVariableValue = (int) variables.get(varName);
        // Value is a variable value
        if (variableValue.contains("@")) {
            int variableToOperate = Integer.parseInt(variableValue);
            variables.put(varName, currentVariableValue + variableToOperate);
            writeAlterFuntion(varName, variableValue);
        }

        // Value is a constant value
        else {
            int newValue = currentVariableValue + Integer.parseInt(variableValue);
            variables.put(varName, currentVariableValue + newValue);
            writeAlterFuntion(varName, String.valueOf(newValue));
        }

        System.out.println(varName);

        return "";
    }

    private void writeAlterFuntion(String varName, String variableValue) {
        try {
            String arduinoVariable = varName + " = " + variableValue + ";\n";
            this.writer.write(arduinoVariable);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Map<String, Object> getVariables() {
        return variables;
    }

    public FileWriter getWriter() {
        return writer;
    }
}
