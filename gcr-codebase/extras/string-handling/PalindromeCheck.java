// Create class PalindromeCheck that checks whether a string is a palindrome or not

import java.util.Scanner;
public class PalindromeCheck {

	// Method to check if string is palindrome
	public boolean isPalindrome(String str) {
		int left = 0, right = str.length() - 1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		
		// Return the results
		return true;
	}

	public static void main(String[] args) {

		// Create a Scanner object to read input
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the values
		System.out.print("Enter a string: ");
		String input = sc.nextLine();

		// Create the object and call the method
		PalindromeCheck checker = new PalindromeCheck();

		// Display the result
		if (checker.isPalindrome(input)) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");
		}

		// Close the scanner stream
		sc.close();
	}
}