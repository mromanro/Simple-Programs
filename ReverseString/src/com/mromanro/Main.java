package com.mromanro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(reverseString("Hello"));
    }

    public static String reverseString(String str) {
        String rvd = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            rvd += str.charAt(i);
        }
        return rvd;
    }
}
