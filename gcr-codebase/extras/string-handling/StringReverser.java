// Create class StringReverser that reverses the characters in a string

import java.util.Scanner;
public class StringReverser {

	// Method to reverse a string
	public String reverseString(String str) {
		char[] chars = str.toCharArray();
		String reversed = "";
		for (int i = chars.length - 1; i >= 0; i--) {
			reversed += chars[i];
		}
		
		// Return the results
		return reversed;
	}

	public static void main(String[] args) {

		// Create a Scanner object to read input
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the values
		System.out.print("Enter a string: ");
		String input = sc.nextLine();

		// Create the object and call the method
		StringReverser reverser = new StringReverser();

		// Display the result
		System.out.println("Reversed: " + reverser.reverseString(input));

		// Close the scanner stream
		sc.close();
	}
}