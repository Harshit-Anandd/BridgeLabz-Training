// Create class CharRemover that removes all occurrences of a specified character from a string

import java.util.Scanner;
public class CharRemover {

	// Method to remove a character from string
	public String removeChar(String str, char toRemove) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != toRemove) {
				result += str.charAt(i);
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
		System.out.print("Enter character to remove: ");
		char ch = sc.next().charAt(0);

		// Create the object and call the method
		CharRemover remover = new CharRemover();

		// Display the result
		System.out.println("Modified String: \"" + remover.removeChar(input, ch) + "\"");

		// Close the scanner stream
		sc.close();
	}
}