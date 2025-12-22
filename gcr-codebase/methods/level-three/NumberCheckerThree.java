// Create class NumberCheckerThree that checks for palindrome and Duck numbers.

import java.util.Scanner;
import java.util.Arrays;
public class NumberCheckerThree {

    // Extract digits from a number and store in array
    public static int[] getDigits(int number) {
        String s = String.valueOf(number);
        int[] digits = new int[s.length()];
        // Convert each character to numeric value
        for(int i=0; i<s.length(); i++) digits[i] = Character.getNumericValue(s.charAt(i));
        
        // Return the array of digits
        return digits;
    }

    // Reverse the digit array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        // Copy digits in reverse order
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        
        // Return the reversed array
        return reversed;
    }

    // Compare two arrays for equality
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        // Return comparison result
        return Arrays.equals(arr1, arr2);
    }

    // Check if digits form a palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        // Return true if original and reversed are equal
        return areArraysEqual(digits, reversed);
    }
    
    // Check if number is a Duck number (contains a zero)
    public static boolean isDuckNumber(int[] digits) {
        for(int d : digits) if(d == 0) return true;
        
        // Return false if no zero found
        return false;
    }

    public static void main(String[] args) {

        // Create Scanner for input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Get digits from number
        int[] digits = getDigits(number);

        // Check and display palindrome result
        if (isPalindrome(digits)) System.out.println("The number is a Palindrome.");
        else System.out.println("The number is not a Palindrome.");
        
        // Check and display Duck number result
        if (isDuckNumber(digits)) System.out.println("The number is a Duck Number.");
        else System.out.println("The number is not a Duck Number.");
        
        // Close the scanner stream
        sc.close();
    }
}