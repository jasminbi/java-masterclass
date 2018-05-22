package com.company;

public class Main {

    public static void main(String[] args) {
        // width of 16 (2 bytes)
        char myChar = '\u00A9';
        System.out.println("unicode character is " + myChar);

        boolean myBoolean = true;
        boolean isMale = false;

        // 1. Find the code for the registered symbol

        // 2. Create a variable of type char and assign it the unicode value for that symbol
        char registeredSymbol = '\u00AE';

        // 3. Display it on screen

        System.out.println("Unicode registered symbol looks like that : " + registeredSymbol);

    }
}
