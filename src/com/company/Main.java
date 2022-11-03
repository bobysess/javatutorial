package com.company;

import static com.company.Console.readByte;
import static com.company.Console.readShort;
import static com.company.Console.readInt;
import static com.company.Console.readLong;
import static com.company.Console.readFloat;
import static com.company.Console.readDouble;
import static com.company.Console.readBoolean;
import static com.company.Console.readChar;
import static com.company.Console.readString;
import static com.company.Console.readChar;
import static com.company.Console.readBoolean;
import static com.company.Console.println;
import static com.company.Console.print;


public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(areaCircle(3));
        System.out.println(areaCarre(5));
        System.out.println(perimeterCarre(4));
        System.out.println(perimeterSquare(3, 4));
        System.out.println(areaSquare(6, 7));
        System.out.println(areaCarre(5));
        printArray(new int[]{1, 2, 4, 5, 6, 7});
        printGreeting();
    }

    public static double areaCircle(double radius) {
        return radius * 3.14;
    }

    public static int areaCarre(int cote) {
        return cote * cote;
    }

    public static int perimeterCarre(int cote) {
        return cote * 4;
    }

    public static int areaSquare(int length, int width) {
        return length * width;
    }

    public static int perimeterSquare(int length, int width) {
        return (length + width) * 2;
    }

    public static void printArray(int[] items) {
        for (int item : items) {
            System.out.println(item);
        }
    }

    public static void printGreeting() {
        System.out.println(" Hello world!");
    }
}
