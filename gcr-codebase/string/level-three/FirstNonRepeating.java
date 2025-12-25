// Create class FirstNonRepeating that finds the first non-repeating character in a String

import java.util.Scanner;
public class FirstNonRepeating {

    // Method to find the first non-repeating character
    public char findFirstNonRepeating(String text) {
		// Count frequency of each character
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;

		// Find first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) return text.charAt(i);
        }
		// Return the results
        return '\0'; // Null char if none found
    }

    public static void main(String[] args) {
		// Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
		// Prompt the user to enter the values
        System.out.print("Enter text: ");
        String text = sc.next();

		// Create the object and call the method
        FirstNonRepeating finder = new FirstNonRepeating();
        char result = finder.findFirstNonRepeating(text);

		// Display the result
        if (result != '\0') {
			System.out.println("First non-repeating: " + result);
		} else {
			System.out.println("No non-repeating characters.");
		}
		
		// Close the scanner stream
        sc.close();
    }
}