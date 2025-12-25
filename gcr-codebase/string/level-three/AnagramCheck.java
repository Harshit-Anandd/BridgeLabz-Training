// Create class AnagramCheck that checks whether two strings are anagrams of each other

import java.util.Scanner;
import java.util.Arrays;
public class AnagramCheck {

    // Method to check if two strings are anagrams
    public boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
			return false;
		}
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
		
		// Return the results
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
		
		// Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
		
		// Prompt the user to enter the values
        System.out.print("Enter string 1: ");
        String s1 = sc.next();
        System.out.print("Enter string 2: ");
        String s2 = sc.next();

		// Create the object and call the method
        AnagramCheck checker = new AnagramCheck();
		
		// Display the result
        if (checker.areAnagrams(s1, s2)) {
			System.out.println("Strings are Anagrams");
		} else {
			System.out.println("Strings are NOT Anagrams");
		}
		
		// Close the scanner stream
        sc.close();
    }
}