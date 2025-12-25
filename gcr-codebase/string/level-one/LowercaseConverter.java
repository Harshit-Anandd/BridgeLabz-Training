// Create class LowercaseConverter that takes a String input from user and converts it in to lower case without using in-built funtions

import java.util.Scanner;
public class LowercaseConverter {
	
	// Method to return the given String in lower case
    public String toLowerCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if uppercase (ASCII 65-90)
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase by adding 32
                result += (char)(ch + 32);
            } else {
                result += ch;
            }
        }
		
		// Return the result
        return result;
    }

    public static void main(String[] args) {
		
		// Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
		
		// Prompt the user to enter the values
        System.out.print("Enter text: ");
        String text = sc.nextLine();
		
		// Create the object and call the method
        LowercaseConverter converter = new LowercaseConverter();
        String customLower = converter.toLowerCase(text);
        String builtInLower = text.toLowerCase();
		
		// Display the result
        System.out.println("Custom Lowercase: " + customLower);
        System.out.println("Built-in Lowercase: " + builtInLower);
        System.out.println("Match: " + customLower.equals(builtInLower));
		
		// Close the scanner stream
        sc.close();
    }
}