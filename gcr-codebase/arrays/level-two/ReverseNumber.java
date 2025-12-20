//Create class ReverseNumber that takes a number as input and prints its reverse.

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner sc = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        
        // Store the original number for processing
        long temp = number;
        // Variable to count number of digits
        int count = 0;

        // Handle the case for 0 explicitly
        if (number == 0) {

            // Print reverse of 0
            System.out.println("Reverse: 0");

            // Close the scanner stream
            sc.close();

            // Exit the program
            System.exit(0);
        }

        // Count number of digits
        while (temp > 0) {

            // Increment digit count
            count++;

            // Remove last digit
            temp /= 10;
        }
        
        // Create an array to store digits
        int[] digits = new int[count];

        // Extract digits and store in array
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(number % 10);
            number /= 10;
        }
        
        // Print the reverse number
        System.out.print("Reverse: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }

        // Close the scanner stream
        sc.close();
    }
}