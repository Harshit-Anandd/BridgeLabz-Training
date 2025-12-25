// Create class PalindromeCheck that checks whether a string is a palindrome using multiple approaches

import java.util.Scanner;
public class PalindromeCheck {

    // Method to check palindrome using loop
    public boolean isPalindromeLoop(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start++) != text.charAt(end--)) return false;
        }
		// Return the results
        return true;
    }

    // Method to check palindrome using recursion
    public boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
			// Return the results
			return true;
		}
		if (text.charAt(start) != text.charAt(end)) {
			// Return the results
			return false;
		}
		// Return the results
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Method to check palindrome using arrays
    public boolean isPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reverse = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reverse[i] = original[original.length - 1 - i];
        }
		// Compare manually
        for(int i=0; i<original.length; i++) 
            if(original[i] != reverse[i]) {
				// Return the results
				return false;
			}
		// Return the results
        return true;
    }

    public static void main(String[] args) {
		
		// Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
		
		// Prompt the user to enter the values
        System.out.print("Enter text: ");
        String text = sc.next();

		// Create the object and call the methods
        PalindromeCheck checker = new PalindromeCheck();
		
		// Display the result
        System.out.println("Loop: " + checker.isPalindromeLoop(text));
        System.out.println("Recursive: " + checker.isPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println("Array: " + checker.isPalindromeArray(text));
		
		// Close the scanner stream
        sc.close();
    }
}