// Create class SubstringCounter that counts the number of occurrences of a substring in a string

import java.util.Scanner;
public class SubstringCounter {

	// Method to count occurrences of a substring
	public int countOccurrences(String str, String sub) {
		int count = 0;
		int index = 0;

		while ((index = str.indexOf(sub, index)) != -1) {
			count++;
			index += sub.length();
		}
		
		// Return the results
		return count;
	}

	public static void main(String[] args) {

		// Create a Scanner object to read input
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the values
		System.out.print("Enter main string: ");
		String str = sc.nextLine();
		System.out.print("Enter substring: ");
		String sub = sc.nextLine();

		// Create the object and call the method
		SubstringCounter counter = new SubstringCounter();

		// Display the result
		System.out.println("Occurrences: " + counter.countOccurrences(str, sub));

		// Close the scanner stream
		sc.close();
	}
}