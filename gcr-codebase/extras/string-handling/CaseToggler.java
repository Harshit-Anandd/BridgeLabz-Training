// Create class CaseToggler that converts uppercase letters to lowercase and vice versa in a string

import java.util.Scanner;
public class CaseToggler {

	// Method to toggle case of characters
	public String toggleCase(String str) {
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];
			if (Character.isUpperCase(c)) {
				chars[i] = Character.toLowerCase(c);
			} else if (Character.isLowerCase(c)) {
				chars[i] = Character.toUpperCase(c);
			}
		}
		
		// Return the results
		String result = new String(chars)
		return result;
	}

	public static void main(String[] args) {

		// Create a Scanner object to read input
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the values
		System.out.print("Enter a string: ");
		String input = sc.nextLine();

		// Create the object and call the method
		CaseToggler toggler = new CaseToggler();

		// Display the result
		System.out.println("Toggled case: " + toggler.toggleCase(input));

		// Close the scanner stream
		sc.close();
	}
}