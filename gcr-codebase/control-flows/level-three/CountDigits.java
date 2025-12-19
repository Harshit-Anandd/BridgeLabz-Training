// Create a class CountDigits that takes a number as input and counts the number of digits in that number.

import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get input number
        System.out.print("Enter a number: ");
        int originalNumber = sc.nextInt();
        
        // Handle negative numbers by using absolute value for counting
        int number = Math.abs(originalNumber);
        
        // Variable to store count
        int count = 0;

        // Handle case for 0 explicitly if needed, otherwise loop works for n > 0
        if (number == 0) {
            count = 1;
        } else {
            // Loop until number becomes 0
            while (number != 0) {
                // Remove last digit
                number = number / 10;
                // Increment count
                count++;
            }
        }

        // Display result
        System.out.println("The number " + originalNumber + " has " + count + " digits.");

        // Close the scanner stream
        sc.close();
    }
}