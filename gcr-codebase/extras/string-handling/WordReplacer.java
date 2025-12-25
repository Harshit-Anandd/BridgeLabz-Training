// Create class WordReplacer that replaces a target word with a replacement word in a sentence

import java.util.Scanner;
public class WordReplacer {

	// Method to replace a word in a sentence
	public String replaceWord(String sentence, String target, String replacement) {
		String[] words = sentence.split(" ");
		String result = "";

		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(target)) {
				result += replacement;
			} else {
				result += words[i];
			}
			if (i < words.length - 1) result += " ";
		}
		
		// Return the results
		return result;
	}

	public static void main(String[] args) {

		// Create a Scanner object to read input
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the values
		System.out.print("Enter sentence: ");
		String sentence = sc.nextLine();
		System.out.print("Enter word to replace: ");
		String target = sc.next();
		System.out.print("Enter replacement word: ");
		String replacement = sc.next();

		// Create the object and call the method
		WordReplacer replacer = new WordReplacer();

		// Display the result
		System.out.println("Modified sentence: " + replacer.replaceWord(sentence, target, replacement));

		// Close the scanner stream
		sc.close();
	}
}