//Create class CompareSumFor that compares the sum of the first n natural numbers calculated using the formula and a for loop.

import java.util.Scanner;
public class CompareSumFor {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if natural number
        if (n > 0) {
            // Formula Calculation
            int formulaSum = n * (n + 1) / 2;

            // For Loop Calculation
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // Compare and Print
            System.out.println("Formula Sum: " + formulaSum);
            System.out.println("Loop Sum: " + loopSum);
            
            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("Computations differ.");
            }
        } else {
            System.out.println("Please enter a natural number (>0).");
        }

        // Close the scanner stream
        sc.close();
    }
}