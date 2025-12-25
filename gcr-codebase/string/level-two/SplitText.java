// Create class SplitText that takes a String input and splits it into an array of words

import java.util.Scanner;
import java.util.Arrays;

public class SplitText {

    // Method to split text using custom logic
    public String[] customSplit(String text) {
		// Count words first
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        String[] words = new String[wordCount];
        String temp = "";
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                temp += text.charAt(i);
            } else {
                words[index++] = temp;
                temp = "";
            }
        }
        words[index] = temp; // Last word
        return words;
    }

    public static void main(String[] args) {
		// Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
		// Prompt the user to enter the values
        System.out.print("Enter sentence: ");
        String text = sc.nextLine();

		// Create the object and call the method
        SplitText splitter = new SplitText();
        String[] customSplit = splitter.customSplit(text);
        String[] builtInSplit = text.split(" ");

		// Display the result
        System.out.println("Are arrays equal: " + Arrays.equals(customSplit, builtInSplit));
		// Close the scanner stream
        sc.close();
    }
}