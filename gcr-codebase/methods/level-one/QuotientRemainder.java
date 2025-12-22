// Create class QuotientRemainder that contains a method to find the quotient and remainder of two numbers.

import java.util.Scanner;
public class QuotientRemainder {

    // Method to find the quotient and remainder
    // Takes a number (dividend) and a divisor, returns an array where index 0 is quotient and index 1 is remainder
    public int[] findRemainderAndQuotient(int number, int divisor) {
        // Calculate quotient using division operator
        int quotient = number / divisor;

        // Calculate remainder using modulus operator
        int remainder = number % divisor;

        // Store values in an array to return both results
        int[] results = {quotient, remainder};
        return results;
    }

    public static void main(String[] args) {
        // Create Scanner object as 'sc'
        Scanner sc = new Scanner(System.in);

        // Input the number (dividend)
        System.out.print("Enter the number (dividend): ");
        int number = sc.nextInt();

        // Input the divisor
        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Validate divisor to avoid division by zero error
        if (divisor == 0) {
            System.out.println("Error: Divisor cannot be zero.");
        } else {
            // Create class object to call the method
            QuotientRemainder calculator = new QuotientRemainder();

            // Get the array containing quotient and remainder
            int[] result = calculator.findRemainderAndQuotient(number, divisor);

            // Extract results from the array for clarity
            int quotient = result[0];
            int remainder = result[1];

            // Display the final output
            System.out.println("The Quotient is: " + quotient);
            System.out.println("The Remainder is: " + remainder);
        }

        // Close the scanner
        sc.close();
    }
}