// Create class AnagramChecker that checks if two strings are anagrams after removing spaces and converting to lowercase

import java.util.Scanner;
import java.util.Arrays;
public class AnagramChecker {

	// Method to check if two strings are anagrams
	public boolean checkAnagram(String s1, String s2) {
		s1 = s1.replaceAll("\\s", "").toLowerCase();
		s2 = s2.replaceAll("\\s", "").toLowerCase();

		if (s1.length() != s2.length()) return false;

		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		// Return the results
		return Arrays.equals(arr1, arr2);
	}

	public static void main(String[] args) {

		// Create a Scanner object to read input
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the values
		System.out.print("Enter first string: ");
		String s1 = sc.nextLine();
		System.out.print("Enter second string: ");
		String s2 = sc.nextLine();

		// Create the object and call the method
		AnagramChecker checker = new AnagramChecker();

		// Display the result
		if (checker.checkAnagram(s1, s2)) {
			System.out.println("Strings are anagrams.");
		} else {
			System.out.println("Strings are not anagrams.");
		}

		// Close the scanner stream
		sc.close();
	}
}