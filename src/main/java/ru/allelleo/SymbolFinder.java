package ru.allelleo;

public class SymbolFinder {
    public static int countSpecialCharacters(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        char[] specialCharacters = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '=', '+', '[', ']', '{', '}', ';', ':', '\'', '"', ',', '<', '.', '>', '/', '?', '\\', '|', '`', '~', 'ß'};

        int count = 0;
        for (char c : input.toCharArray()) {
            if (isSpecialCharacter(c, specialCharacters)) {
                count++;
            }
        }
        return count;
    }
    private static boolean isSpecialCharacter(char c, char[] specialCharacters) {
        for (char special : specialCharacters) {
            if (c == special) {
                return true;
            }
        }
        return false;
    }

}
