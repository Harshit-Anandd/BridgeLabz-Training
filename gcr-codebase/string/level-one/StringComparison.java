// Create class StringComparison that compares the equality of two String by using built-in methods and user-defined methods

import java.util.Scanner;
public class StringComparison {

    // Method to compare two strings using charAt()
    public boolean compareStrings(String str1, String str2) {
        // If lengths differ, strings are not equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Check character by character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
		
		// Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
		
		// Prompt the user to enter the values
        System.out.print("Enter first string: ");
        String string1 = sc.next();
        System.out.print("Enter second string: ");
        String string2 = sc.next();
		
		// Create the object and call the method
        StringComparison comparator = new StringComparison();
        boolean charAtResult = comparator.compareStrings(string1, string2);
        boolean builtInResult = string1.equals(string2);
		
		// Display the result
        System.out.println("Comparison using charAt(): " + charAtResult);
        System.out.println("Comparison using equals(): " + builtInResult);
        if (charAtResult == builtInResult) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Methods give different results.");
        }
		
		// Close the scanner stream
        sc.close();
    }
}