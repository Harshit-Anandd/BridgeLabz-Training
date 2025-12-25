// Create class UniqueChars that finds and displays all unique characters in a String

import java.util.Scanner;
public class UniqueChars {

    // Method to find unique characters
    public char[] findUnique(String text) {
        String unique = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean found = false;
            for (int j = 0; j < unique.length(); j++) {
                if (unique.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }
            if (!found) unique += ch;
        }
		// Return the results
        return unique.toCharArray();
    }

    public static void main(String[] args) {
		
		// Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
		
		// Prompt the user to enter the values
        System.out.print("Enter text: ");
        String text = sc.next();

		// Create the object and call the method
        UniqueChars finder = new UniqueChars();
        char[] unique = finder.findUnique(text);

		// Display the result
        System.out.print("Unique chars: ");
        for (char c : unique) System.out.print(c + " ");
		
		// Close the scanner stream
        sc.close();
    }
}