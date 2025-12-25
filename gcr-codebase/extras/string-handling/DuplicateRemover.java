// Create class DuplicateRemover that removes duplicate characters and keeps only the first occurrence of each

import java.util.Scanner;
public class DuplicateRemover {

	// Method to remove duplicate characters
	public String removeDuplicates(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			// Check if char is already in result
			if (result.indexOf(ch) == -1) {
				result += ch;
			}
		}
		
		// Return the results
		return result;
	}

	public static void main(String[] args) {

		// Create a Scanner object to read input
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the values
		System.out.print("Enter a string: ");
		String input = sc.nextLine();

		// Create the object and call the method
		DuplicateRemover remover = new DuplicateRemover();

		// Display the result
		System.out.println("String without duplicates: " + remover.removeDuplicates(input));

		// Close the scanner stream
		sc.close();
	}
}