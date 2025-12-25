// Create class VowelConsonantCounter that counts the number of vowels and consonants in a String

import java.util.Scanner;
public class VowelConsonantCounter {

    // Method to count vowels and consonants
    public int[] countTypes(String text) {
        int vowels = 0, consonants = 0;
        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
		// Return the results
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
		
		// Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
		
		// Prompt the user to enter the values
        System.out.print("Enter text: ");
        String text = sc.nextLine();

		// Create the object and call the method
        VowelConsonantCounter counter = new VowelConsonantCounter();
        int[] counts = counter.countTypes(text);

		// Display the result
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
		
		// Close the scanner stream
        sc.close();
    }
}