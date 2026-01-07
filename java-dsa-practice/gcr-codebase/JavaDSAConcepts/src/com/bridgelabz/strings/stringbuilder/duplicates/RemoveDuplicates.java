package com.bridgelabz.strings.stringbuilder.duplicates;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        // Iterate over each character
        for (char c : str.toCharArray()) {
            // If character not in set, append to SB and add to set
            if (!seen.contains(c)) {
                sb.append(c);
                seen.add(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner (System.in);
    	System.out.println("Enter some text: ");
        String input = sc.nextLine();
        System.out.println("Original: " + input);
        System.out.println("No Duplicates: " + removeDuplicates(input));
        sc.close();
    }
}