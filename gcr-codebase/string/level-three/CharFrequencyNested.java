// Create class CharFrequencyNested that counts character frequency using nested loops

import java.util.Scanner;
public class CharFrequencyNested {

    // Method to show frequency using nested loop approach
    public void showFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[text.length()];

		// Count frequency using nested loops
        for(int i=0; i<text.length(); i++) {
            freq[i] = 1;
            for(int j=i+1; j<text.length(); j++) {
                if(chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // Mark as visited
                }
            }
        }

		// Display the result
        for(int i=0; i<text.length(); i++) {
            if(chars[i] != '0' && chars[i] != ' ') {
                System.out.println(chars[i] + ": " + freq[i]);
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
        CharFrequencyNested counter = new CharFrequencyNested();
        counter.showFrequency(text);
		
		// Close the scanner stream
        sc.close();
    }
}