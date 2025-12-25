// Create class CharFrequencyASCII that counts the frequency of each character using ASCII values

import java.util.Scanner;
public class CharFrequencyASCII {

    // Method to show frequency of characters
    public void showFrequency(String text) {
		// Create array to store frequency count for all ASCII characters
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;

		// Display the result
        System.out.println("Character Frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + ": " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {
		
		// Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
		
		// Prompt the user to enter the values
        System.out.print("Enter text: ");
        String text = sc.next();

		// Create the object and call the method
        CharFrequencyASCII counter = new CharFrequencyASCII();
        counter.showFrequency(text);
		
		// Close the scanner stream
        sc.close();
    }
}