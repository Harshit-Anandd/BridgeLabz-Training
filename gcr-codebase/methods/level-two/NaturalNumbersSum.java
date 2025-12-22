// Create class NaturalNumbersSum to calculate sum of first n natural numbers

import java.util.Scanner;
public class NaturalNumbersSum {

    // Method to find sum using recursion
    public int calculateSumRecursive(int n) {

        // Base case: if n is 1, return 1
        if (n == 1) {
            return 1;
        }

        // Recursive call
        return n + calculateSumRecursive(n - 1);
    }

    // Method to find sum using formula n*(n+1)/2
    public int calculateSumFormula(int n) {
        // Using the formula
        int sum = (n * (n + 1)) / 2;
        // Return the calculated sum
        return sum;
    }

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a natural number n: ");
        int n = sc.nextInt();

        // Validate if it is a natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {
            NaturalNumbersSum calculator = new NaturalNumbersSum();

            // Calculate using both methods
            int sumRecursive = calculator.calculateSumRecursive(n);
            int sumFormula = calculator.calculateSumFormula(n);

            // Display results
            System.out.println("Sum using Recursion: " + sumRecursive);
            System.out.println("Sum using Formula: " + sumFormula);

            // Compare results
            if (sumRecursive == sumFormula) {
                System.out.println("Both computations are correct and match.");
            } else {
                System.out.println("Computations do not match.");
            }
        }

        // Close the scanner stream
        sc.close();
    }
}