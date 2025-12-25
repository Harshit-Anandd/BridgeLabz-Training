// Create class WordLengthAnalyzer that analyzes words and their lengths from a sentence

import java.util.Scanner;
public class WordLengthAnalyzer {

    // Method to get length of a string
    public int getLength(String s) {
        return s.length();
    }

    // Method to get words and their lengths
    public String[][] getWordsAndLengths(String text) {
        String[] words = text.split(" "); // Using built-in for brevity in logic
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
		
		// Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
		
		// Prompt the user to enter the values
        System.out.print("Enter sentence: ");
        String text = sc.nextLine();

		// Create the object and call the method
        WordLengthAnalyzer analyzer = new WordLengthAnalyzer();
        String[][] results = analyzer.getWordsAndLengths(text);

		// Display the result
        System.out.println("Word\tLength");
        for (String[] row : results) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
		
		// Close the scanner stream
        sc.close();
    }
}