// Create class StringExtremes that finds the shortest and longest words in a sentence

import java.util.Scanner;

public class StringExtremes {

    // Method to find shortest and longest words
    public String[] getExtremes(String text) {
        String[] words = text.split(" ");
        String shortest = words[0];
        String longest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length()) shortest = word;
            if (word.length() > longest.length()) longest = word;
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
		// Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
		// Prompt the user to enter the values
        System.out.print("Enter sentence: ");
        String text = sc.nextLine();

		// Create the object and call the method
        StringExtremes finder = new StringExtremes();
        String[] extremes = finder.getExtremes(text);

		// Display the result
        System.out.println("Shortest word: " + extremes[0]);
        System.out.println("Longest word: " + extremes[1]);
		// Close the scanner stream
        sc.close();
    }
}