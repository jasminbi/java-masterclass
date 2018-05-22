package com.company;

public class Main {

    public static void main(String[] args) {

        //1. Create a byte variable and set it to any valid byte number.

        byte myByteNumber = 10;

        //2. Create a short variable and set it to any valid short number.

        short myShortNumber = 125;

        //3. Create an int variable and set it to any valid int number.
        int myIntNumber = 757;

        //4. Create a variable of type long, and make it equal to 50000 + 10 times the sum of the byte, plus the short
        //   plus the int
        long myLongTotal = 50000 + 10 * (myByteNumber + myIntNumber + myShortNumber);
    }
}
