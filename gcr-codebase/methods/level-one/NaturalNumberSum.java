// Java program to calculate the sum of n natural numbers

import java.util.Scanner;
public class NaturalNumberSum {

    // Method to calculate sum of n natural numbers
    public int calculateSum(int n) {

        // Initialize sum variable
        int sum = 0;

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            sum += i; // Add current number to sum
        }

        // Return the calculated sum
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for natural number n
        System.out.print("Enter a natural number n: ");
        int n = sc.nextInt();

        // Validate input (Natural numbers are > 0)
        if (n < 1) {

            // Display error message for invalid input
            System.out.println("Please enter a natural number (greater than 0).");
        } else {

            // Create class object and calculate sum
            NaturalNumberSum calculator = new NaturalNumberSum();
            int sum = calculator.calculateSum(n);

            // Display the result
            System.out.println("The sum of " + n + " natural numbers is: " + sum);
        }
        
        // Close the scanner object
        sc.close();
    }
}