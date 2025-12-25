// Create class CharFrequencyUnique that finds unique characters and counts their frequency

import java.util.Scanner;
public class CharFrequencyUnique {

    // Method to get unique characters from text
    public char[] getUnique(String text) {
        String unique = "";
        for (int i = 0; i < text.length(); i++) {
            if (unique.indexOf(text.charAt(i)) == -1) unique += text.charAt(i);
        }
		// Return the results
        return unique.toCharArray();
    }

    // Method to show frequency of unique characters
    public void showFrequency(String text) {
        char[] unique = getUnique(text);
        for (char u : unique) {
            int count = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == u) count++;
            }
            System.out.println(u + ": " + count);
        }
    }

    public static void main(String[] args) {
		
		// Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
		
		// Prompt the user to enter the values
        System.out.print("Enter text: ");
        String text = sc.next();

		// Create the object and call the method
        CharFrequencyUnique counter = new CharFrequencyUnique();
        counter.showFrequency(text);
		
		// Close the scanner stream
        sc.close();
    }
}