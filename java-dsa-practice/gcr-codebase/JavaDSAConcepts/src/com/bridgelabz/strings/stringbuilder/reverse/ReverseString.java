package com.bridgelabz.strings.stringbuilder.reverse;

import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        sb = sb.reverse();
        return sb.toString(); 
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner (System.in);
    	System.out.println("Enter some text: ");
        String input = sc.nextLine();
        String reversed = reverseString(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
        sc.close();
    }
}