package com.sphere.util;

public class Utils {
    public static boolean isAlphanumeric(String input) {
        return input.matches("(?i)[a-z0-9]+");
    }

    public static boolean isDigit(String input) {
        return input.matches("\\d*");
    }

    public static boolean isAlphabetic(String input) {
        return input.matches("(?i)[a-zA-Z]+");
    }
}
