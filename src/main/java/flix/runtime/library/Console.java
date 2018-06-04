package flix.runtime.library;

import java.util.Scanner;

public final class Console {

    public static String readLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void printStdOut(String s) {
        System.out.print(s);
    }

    public static void printLineStdOut(String s) {
        System.out.println(s);
    }

    public static void newLineStdOut() {
        System.out.println();
    }


    public static void flushStdOut() {
        System.out.flush();
    }

    public static void printStdErr(String s) {
        System.err.print(s);
    }

    public static void printLineStdErr(String s) {
        System.err.println(s);
    }

    public static void newLineStdErr() {
        System.err.println();
    }


    public static void flushStdErr() {
        System.err.flush();
    }

}
