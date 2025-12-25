// Create class VowelConsonantCounter that counts the number of vowels and consonants in a string

import java.util.Scanner;
public class VowelConsonantCounter {

	// Method to count vowels and consonants
	public void countChars(String str) {
		int vowels = 0, consonants = 0;
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}
		}

		// Display the result
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
	}

	public static void main(String[] args) {

		// Create a Scanner object to read input
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the values
		System.out.print("Enter a string: ");
		String input = sc.nextLine();

		// Create the object and call the method
		VowelConsonantCounter counter = new VowelConsonantCounter();
		counter.countChars(input);

		// Close the scanner stream
		sc.close();
	}
}