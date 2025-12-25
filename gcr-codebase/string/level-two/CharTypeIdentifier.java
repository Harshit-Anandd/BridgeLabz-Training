// Create class CharTypeIdentifier which takes a String as an input and then identifies the type of each character of the String

import java.util.Scanner;
public class CharTypeIdentifier {
	
	// Method to identify the type of an individual character
    public String identifyType(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            }
            return "Consonant";
        }
        return "Not a Letter";
    }

    public static void main(String[] args) {
		
		// Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
		
		// Prompt the user to enter the values
        System.out.print("Enter text: ");
        String text = sc.next();
		
		// Create the object and call the method
        CharTypeIdentifier identifier = new CharTypeIdentifier();
        System.out.println("Char\tType");
		
		// Display the result
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            System.out.println(ch + "\t" + identifier.identifyType(ch));
        }
		
		// Close the scanner stream
        sc.close();
    }
}