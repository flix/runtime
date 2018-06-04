package flix.runtime.library;

public final class Char {

    public static boolean isAscii(char c) {
        return c <= 127;
    }

    public static boolean isLetter(char c) {
        return java.lang.Character.isLetter(c);
    }

    public static boolean isDigit(char c) {
        return java.lang.Character.isDigit(c);
    }

    public static boolean isOctDigit(char c) {
        return '0' <= c && c <= '7';
    }

    public static boolean isHexDigit(char c) {
        return ('0' <= c && c <= '7') || ('a' <= c && c <= 'f') || ('A' <= c && c <= 'F');
    }

    public static boolean isLowerCase(char c) {
        return java.lang.Character.isLowerCase(c);
    }

    public static boolean isUpperCase(char c) {
        return java.lang.Character.isUpperCase(c);
    }

    public static boolean isWhiteSpace(char c) {
        return java.lang.Character.isWhitespace(c);
    }

    public static char toLowerCase(char c) {
        return java.lang.Character.toLowerCase(c);
    }

    public static char toUpperCase(char c) {
        return java.lang.Character.toUpperCase(c);
    }

    public static String toString(char c) {
        return String.valueOf(c);
    }

}
