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
        // Array definition
        int[] numbers = {3, 4, 7, 8, 9};
        float[] weights = {1.2f, 2.3f, 4.5f, 6.7f};
        String[] names = {"Müller", "Otto", "Mika", "Lena"};
        String[] fruits = {"Orange", "Apple", "Pear", "Strawbeer"};
        // other way and defaults values
        int[] ids = new int[3]; // => {0, 0, 0}
        float[] floats = new float[3]; // => {0.0, 0.0, 0.0}
        boolean[] booleans = new boolean[3]; // => {false, false, false}
        String[] strings = new String[3]; //  => {null, null,  null }

        // accessing the array
        System.out.println("Item at 1. position: " + numbers[0]);
        numbers[0] = 1;
        System.out.println("Item at 1. position: " + numbers[0]);

        // length
        int size = numbers.length;
        System.out.println("length:" + numbers.length);

        //access  all Elements
        // with  while ...
        int e = 0;
        while (e < numbers.length) {
            System.out.println("Item at " + (e + 1) + ". position :" + numbers[e]);
            e++;
        }

        // with for ...
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Item at " + (i + 1) + ". position :" + numbers[i]);
        }

        // with for each ..
        for (int number : numbers) {
            System.out.println(number);
        }


        // geschlachted Arrays
        int[][] positions = new int[3][3];
        int[][] positions2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] positionsX = positions[0];
        int positionsxy = positions[0][0];
        for (int ix = 0; ix < positions.length; ix++) {
            for (int iy = 0; iy < positions[ix].length; iy++) {
                System.out.println(positions[ix][iy]);
            }
        }

        // EX  https://www.w3resource.com/java-exercises/array/index.php
        // ignore:
        // complex: 1, 3,
    }
}
