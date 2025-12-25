// Create class LowercaseConverter that takes a String input from user and converts it in to upper case without using in-built funtions

import java.util.Scanner;
public class UppercaseConverter {

    public String toUpperCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if lowercase (ASCII 97-122)
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase by subtracting 32
                result += (char)(ch - 32);
            } else {
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
        System.out.print("Enter text: ");
        String text = sc.nextLine();
		
		// Create the object and call the method
        UppercaseConverter converter = new UppercaseConverter();
        String customUpper = converter.toUpperCase(text);
        String builtInUpper = text.toUpperCase();
		
		// Display the result
        System.out.println("Custom Uppercase: " + customUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Match: " + customUpper.equals(builtInUpper));
		
		// Close the scanner stream
        sc.close();
    }
}