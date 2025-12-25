// Create class StringComparator that compares two strings lexicographically

import java.util.Scanner;
public class StringComparator {

	// Method to compare two strings lexicographically
	public int compareStrings(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		int minLen = Math.min(len1, len2);

		for (int i = 0; i < minLen; i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			if (c1 != c2) {
				return c1 - c2;
			}
		}
		
		// Return the results
		return len1 - len2;
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
		StringComparator comp = new StringComparator();
		int result = comp.compareStrings(s1, s2);

		// Display the result
		if (result < 0) {
			System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
		} else if (result > 0) {
			System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\"");
		} else {
			System.out.println("Strings are equal.");
		}

		// Close the scanner stream
		sc.close();
	}
}