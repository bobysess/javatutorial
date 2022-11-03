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


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // if ..
        int old = 10;
        if (old > 100) {
            System.out.println(" old  ");
        }

        int oldA = 10, oldB=2, oldC=3;
        if ((oldA > oldB) &&  (oldA > oldC)) {
            System.out.println("A ist oldst!!");
        }

        // decision making If .. else
        int a = -10, b = 10;
        if (a > b) {
           System.out.println(" a is bigger than b");
        } else  {
            System.out.println("a is lesser  than b");
        }

        // if .. if else .. else
        int c = 2;
        if (c  == 3)
        {
            System.out.println ("c equals 3");
        } else if (c ==  10)  {
            System.out.println ("c equals 10");
        } else {
            System.out.println ("c equals 3");
        }

        // switch
        int month = 2;
        switch (month) {
            case 1:
                System.out.println("januar");
                break;
            case 2:
                System.out.println("Februar");
                break;
            default:
                System.out.println("it is not a nnumber");
        }

        char sex = 'F'; // 'F' or 'M'
        switch (sex) {
            case 'F':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("Male");
                break;
            default:
                System.out.println("sex unknown");
                break;
        }

        String  mark = "Mercedes";
        switch (mark) {
            case "Mercedes":
                System.out.println(" the car is aMercedes");
                break;
            case "Ford":
                System.out.println(" the car is a Ford");
                break;
            default:
                System.out.println("the car ist unknow");
                break;
        }


        // while () {..}
        int i=0;
        while(i<10){
            System.out.println(i);
            i++;
        }

        // do .. while ...
        int i2 = 0;
        do {
            i2++;
            System.out.println(i2 + ". time");
        } while (i2 <= 10);


        // for ..
        for  (int i3 =0; i3 < 10; i3++) {
            System.out.println(i3);
        }



        System.out.println("---EX1");
        Scanner scan = new  Scanner(System.in);
        // EX: https://www.w3resource.com/java-exercises/conditional-statement/index.php
        // 5.  with switch and loop exercise start a 10.
        // ignore too complicated 11, 19, 21, 22, 24, 25, 26
    }
}
