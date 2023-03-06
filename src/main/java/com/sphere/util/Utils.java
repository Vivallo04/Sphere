package com.sphere.util;

public class Utils {
    public static boolean isAlphanumeric(char character) {
        return Character.isDigit(character) || Character.isLetter(character);
    }
}
