//Create class DigitFrequency that takes a number as input and counts the frequency of each digit (0-9) in the number.

import java.util.Scanner;
public class DigitFrequency {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner sc = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        

        // Create an array to store frequency of digits 0-9
        int[] frequency = new int[10];
        
        // Count frequency of each digit
        while (number > 0) {
            int digit = (int)(number % 10);
            frequency[digit]++;
            number /= 10;
        }
        
        // Print the frequency of each digit
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times.");
            }
        }

        // Close the scanner stream
        sc.close();
    }
}