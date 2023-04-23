package com.sphere.util;

public class Utils {
    public static boolean isAlphanumeric(String input) {
        return input.matches("(?i)[a-z0-9]+");
    }

    public static boolean isDigit(String input) {
        return input.matches("\\d*");
    }

    public static boolean isBoolean(String input) {
        String booleanTrue = "True";
        String booleanFalse = "False";
        return input.equals(booleanTrue) || input.equals(booleanFalse);
    }

    public static boolean isNumeric(String input) {
        return input.matches("(?i)[0-9]+");
    }

    public static boolean isAlphabetic(String input) {
        return input.matches("(?i)[a-zA-Z]+");
    }

    public static boolean isEnclosedInQuotes(String input) {
        return input.startsWith("\"") && input.endsWith("\"");
    }
}
