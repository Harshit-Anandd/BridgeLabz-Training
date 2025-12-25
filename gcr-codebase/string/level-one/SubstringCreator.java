// Create class SubstringCreator that creates substrings using the built-in charAt() method

import java.util.Scanner;
public class SubstringCreator {

    // Method to create substring using charAt()
    public String createSubstring(String text, int start, int end) {
        String substring = "";
        for (int i = start; i < end; i++) {
            substring += text.charAt(i);
        }
		
		// Return the results
        return substring;
    }

    public static void main(String[] args) {
		
		// Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
		
		// Prompt the user to enter the values
        System.out.print("Enter a string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
		
		// Create the object and call the method
        SubstringCreator creator = new SubstringCreator();
        
        // Custom substring
        String customSub = creator.createSubstring(text, start, end);
        
        // Built-in substring
        String builtInSub = text.substring(start, end);
		
		// Display the result
        System.out.println("Custom Substring: " + customSub);
        System.out.println("Built-in Substring: " + builtInSub);
		
		// Check equality
        if (customSub.equals(builtInSub)) {
            System.out.println("Both substrings are equal.");
        } else {
            System.out.println("Substrings differ.");
        }
		
		// Close the scanner stream
        sc.close();
    }
}