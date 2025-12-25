// Create class GeneralPalindrome that checks if a string is a palindrome ignoring spaces and case

import java.util.Scanner;
public class GeneralPalindrome {

	// Method to check if a string is a palindrome
	public boolean check(String text) {
		String clean = text.replaceAll("\\s", "").toLowerCase();
		int start = 0;
		int end = clean.length() - 1;

		while (start < end) {
			if (clean.charAt(start) != clean.charAt(end)) return false;
			start++;
			end--;
		}
		
		// Return the results
		return true;
	}

	public static void main(String[] args) {

		// Create a Scanner object to read input
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the values
		System.out.print("Enter text: ");
		String text = sc.nextLine();

		// Create the object and call the method
		GeneralPalindrome pal = new GeneralPalindrome();

		// Display the result
		if (pal.check(text)) {
			System.out.println("It is a palindrome.");
		} else {
			System.out.println("It is not a palindrome.");
		}

		// Close the scanner stream
		sc.close();
	}
}