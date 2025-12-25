// Create class FrequentCharFinder that finds the most frequently occurring character in a string

import java.util.Scanner;
public class FrequentCharFinder {

	// Method to find the most frequently occurring character
	public char findMostFrequent(String str) {

		// Create frequency array and initialize tracking variables
		int[] freq = new int[256];
		char maxChar = str.charAt(0);
		int maxCount = 0;

		// Count frequency of each character
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			freq[ch]++;
			if (freq[ch] > maxCount) {
				maxCount = freq[ch];
				maxChar = ch;
			}
		}
		
		// Return the results
		return maxChar;
	}

	public static void main(String[] args) {

		// Create a Scanner object to read input
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the values
		System.out.print("Enter a string: ");
		String input = sc.nextLine();

		// Create the object and call the method
		FrequentCharFinder finder = new FrequentCharFinder();

		// Display the result
		System.out.println("Most Frequent Character: '" + finder.findMostFrequent(input) + "'");

		// Close the scanner stream
		sc.close();
	}
}