// Create class StringLength that calculates the length of a String without using built-in methods

import java.util.Scanner;

public class StringLength {

    // Method to find length using exception handling
    public int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
			// Exception indicates end of string
            return count;
        }
    }

    public static void main(String[] args) {
		// Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
		// Prompt the user to enter the values
        System.out.print("Enter text: ");
        String text = sc.next();

		// Create the object and call the method
        StringLength calculator = new StringLength();
        int customLen = calculator.findLength(text);
        int builtInLen = text.length();

		// Display the result
        System.out.println("Custom Length: " + customLen);
        System.out.println("Built-in Length: " + builtInLen);
		// Close the scanner stream
        sc.close();
    }
}