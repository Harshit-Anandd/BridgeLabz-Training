// Create class TrimString that removes leading and trailing spaces from a String

import java.util.Scanner;

public class TrimString {

    // Method to find trim indexes
    public int[] findTrimIndexes(String text) {
        int start = 0, end = text.length() - 1;

        while (start < text.length() && text.charAt(start) == ' ') start++;
        while (end >= 0 && text.charAt(end) == ' ') end--;

        return new int[]{start, end + 1};
    }

    // Method to create substring manually
    public String createSubstring(String text, int start, int end) {
        String res = "";
        for(int i=start; i<end; i++) res += text.charAt(i);
        return res;
    }

    public static void main(String[] args) {
		// Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
		// Prompt the user to enter the values
        System.out.println("Enter text with spaces:");
        String text = sc.nextLine();

		// Create the object and call the method
        TrimString trimmer = new TrimString();
        int[] indexes = trimmer.findTrimIndexes(text);
        
		// Display the result
        if (indexes[0] > indexes[1]) { // Case for empty or all-space string
            System.out.println("Trimmed: ''");
        } else {
            String trimmed = trimmer.createSubstring(text, indexes[0], indexes[1]);
            System.out.println("Custom Trimmed: '" + trimmed + "'");
            System.out.println("Built-in Trim: '" + text.trim() + "'");
        }
		// Close the scanner stream
        sc.close();
    }
}