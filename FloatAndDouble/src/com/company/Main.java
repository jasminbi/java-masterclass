package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        //width of int = 32 (4 bytes)
        int myIntValue = 5/2;

        //width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;

        //width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("My Int Value is: " + myIntValue);
        System.out.println("My Float Value is: " + myFloatValue);
        System.out.println("My Double Value is: " + myDoubleValue);

        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds

        double pounds = 200d;

        // 2. Calculate the number of Kilograms for the number above and store in a variable.

        double convertedKilograms = pounds * 0.45359237d;

        // 3. Print out the result

        System.out.println("The result is: " + convertedKilograms + " Kilograms");


    }
}
