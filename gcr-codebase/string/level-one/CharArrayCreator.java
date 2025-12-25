// Create class CharArrayCreator that takes a String as an input from the user and then performs operations on it without using built-in funtions

import java.util.Scanner;
public class CharArrayCreator {

    // Method to return characters without toCharArray()
    public char[] getChars(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
		
		// 
        return chars;
    }

    // Method to compare two character arrays for euqality
    public boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
			return false;
		}
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
				return false;
			}
        }
        return true;
    }

    public static void main(String[] args) {
		
		// Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
		
		// Prompt the user to enter the values
        System.out.print("Enter text: ");
        String text = sc.next();
		
		// Create the object and call the method
        CharArrayCreator creator = new CharArrayCreator();
        char[] customArr = creator.getChars(text);
        char[] builtInArr = text.toCharArray();
        boolean isEqual = creator.compareArrays(customArr, builtInArr);
		
		// Display the result
        System.out.println("Arrays are equal: " + isEqual);
		
		// Close the scanner stream
        sc.close();
    }
}