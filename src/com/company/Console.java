package com.company;


import java.util.Scanner;

public class Console {

    private static Scanner scan = new Scanner(System.in);

    public static byte readByte() {
        return scan.nextByte();
    }

    public static short readShort() {
        return scan.nextShort();
    }

    public static int readInt() {
        return scan.nextInt();
    }

    public static long readLong() {
        return scan.nextLong();
    }

    public static double readFloat() {
        return scan.nextFloat();
    }

    public static double readDouble() {
        return scan.nextDouble();
    }

    public static char readChar() {
        return scan.next().charAt(0);
    }

    public static boolean readBoolean() {
        return scan.nextBoolean();
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
