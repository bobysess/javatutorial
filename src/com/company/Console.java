package com.company;


import java.util.Scanner;

public class Console {

    private static Scanner scan = new Scanner(System.in);


    public static int readInt() {
        return scan.nextInt();
    }

    public static double readDouble() {
        return scan.nextDouble();
    }

    public static String readString() {
        return scan.nextLine();
    }

    public static void print(String s) {
        System.out.println(s);
    }

    public static void println(String s) {
        System.out.println(s);
    }
}
