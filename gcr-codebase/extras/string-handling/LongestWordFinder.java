// Create class LongestWordFinder that finds and returns the longest word from a given sentence

import java.util.Scanner;
public class LongestWordFinder {

	// Method to find the longest word
	public String findLongestWord(String sentence) {
		String[] words = sentence.split(" ");
		String longest = "";

		// Compare length of each word to find the longest
		for (String word : words) {
			if (word.length() > longest.length()) {
				longest = word;
			}
		}
		
		// Return the results
		return longest;
	}

	public static void main(String[] args) {

		// Create a Scanner object to read input
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the values
		System.out.print("Enter a sentence: ");
		String input = sc.nextLine();

		// Create the object and call the method
		LongestWordFinder finder = new LongestWordFinder();

		// Display the result
		System.out.println("Longest word: " + finder.findLongestWord(input));

		// Close the scanner stream
		sc.close();
	}
}