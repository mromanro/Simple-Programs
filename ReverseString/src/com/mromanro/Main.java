package com.mromanro;

/**
 * Program that reverses a given string
 */
public class Main {

    /**
     * Main method
     *
     * @param args arguments
     */
    public static void main(String[] args) {
	// write your code here
        System.out.println(reverseString("Hello"));
    }

    /**
     * Reverses a given string.
     * Ex. Given "Hello", this function returns "olleH"
     *
     * @param str the string to reverse
     * @return  the reversed string
     */
    public static String reverseString(String str) {
        String rvd = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            rvd += str.charAt(i);
        }
        return rvd;
    }

    //Try another way
}
