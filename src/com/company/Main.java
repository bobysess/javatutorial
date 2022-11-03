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
	// write your code here

        // WHOLE NUMBER/INTEGERs
        byte oldOfMohter = 23;  // 8  bit,   -128 to 127
        short x = -10; // 16 bit,   -32.768 to  -32.767
        int numberOfStudents = 80;  //  32 bit, - 2,147,483,648 to - 2,147,483,647
        long   salaire = 10_000_000L; // 64 bit, -9,223,372,036,854,775,808 to  -9,223,372,036,854,775,807

        // INTEGER IN  HEX; OC
        int decimal = 100;
        int octal = 0144;   //
        int hexa =  0x64;  // prefix "0x"
        int binary = 0b101; // prefix "0b"

        // DECIMAL NUMBERS
        float  weight  = 76.5f; // 32-bit
        double PI = 3.14; // 64-bit

        // Boolean
        boolean isCorrect = true; // true/false
        boolean isMarried = false;

        //String chain the character
        String name = "Müller";
        String IBAN = "DE02120300000000202051";
        String telefonumber = "+4916474647700";
        String country = "cameroon";
        String concate = "Hello " + " Otto"; // => Hello Otto
        String greeting = "Hello " + name;  // =>  Hello Müller

        //EX1: create  variables to save following data (by thinking about the best dataType und with other without value):
        //radius (14.4),  PI (3.14),  speed (2.4),  gehalt (10.000.000.000),  distane (1000),  firstame (Ottoma), message (hallo chat)
        //animal (lion), adresse (mainstr. 40, 67546 New York),  gender (female), city (Douala)


        // BASIC  OPERATION
        // Arithemthic
        int a = 11,b = 10;
        int add = a + b;  // => 10
        int sub = 50 - b; // => 40
        int mul = a * 5; // => 55
        int div = 50 / b; // => 5
        int mod = 53 % b; //  => 3

        // The Assignment Operators
        a ++; // increment  <=> a = a+1
        b --; // decrement  <=> b = b-1
        a += 3; // =>  a = a + 12
        b -= 4; // =>  b = b - 13
        b *= 2;  // => b = b * 2
        // the same with /=, %=, *=

        // The Relational/Comparaison Operators
        int y = -1, z = 1;
        boolean zEqualsY =  y == z; // => false
        boolean isZDifferentFromY=  y != z;  // => true
        boolean iszPositiv = z > 0;  // => true
        boolean isYPositiv = y > 0; // =>  false
        boolean iszBiggerOrEqual1 = z >=  1;
        boolean isylesserOrEqual1 = y <= -1;

        // The Logical Operators
        boolean comparaison1 =  (10 > 6) && (5 > 2); // => true
        boolean comparaison2 =  (2 > 6) || (5 > 2);  // => true
        boolean comparaison3 =  !(1 > 0); // => false
        int max = (y > z)? y : z;
        int min = (z < y)? z : y;

        // Out In Console
        System.out.print("Hello ");
        System.out.print("Otto");
        System.out.println("Hello ");
        System.out.println("Otto");

        // Input in Console
        //Scanner scan = new Scanner (System.in);
        int old = readInt();
        double weightOfOtto = readDouble();
        String firstname  = readString();

        // EX2: write a program which read a number of  minutes and convert to number of day and years and print it (days = minutes/(24*60),  years = days/360)
        // EX3: write a program which read a distance in inch and convert it to meter and print (meter = inch*0.0254)
        // EX4: Write a program to compute body mass index (body mass index = weight/height). the program most read weight and height from the console
        // EX5: write a program that calculate speed. the program most read distance (in meter) und time (in second) out the console (s = d/t). print the speed in different units m/s, km/s, km/h
        // EX6: write a program that read a number from console and print his the square, cube, and fourth power
        // EX7: Write a Java program that accepts two integers from console and print their sum, difference, product, average, modulo,  the max and min
        // EX: Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer


        // Bitwise Oeprator
        int byte1 = 0b01;
        int byte2 = 0b10;
        int andBits = byte1 & byte2;// => 00
        int orBits = byte1 | byte2;// => 11
        int xorBits = 0b0110 ^ 0b011;// => 001
        int notBits = ~0b0011;  // => 1100
        int shiftLeft = 0b0011 << 1; // 0110
        int shiftRight = 0b1100 >> 2; // 0011

        // Char
        char  letterA = 'a'; // 16 bit ->
        // unicode table:  https://www.rapidtables.com/code/text/unicode-characters.html
        char  letterAInUnicode = '\u0041';

        // String Advanced
        String newline = "sfaff \\n \\r";
    }
}
