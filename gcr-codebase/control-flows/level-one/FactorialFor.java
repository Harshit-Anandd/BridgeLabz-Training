//Create class FactorialFor that calculates the factorial of a given positive integer using a for loop.

import java.util.Scanner;
public class FactorialFor {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number >= 0) {
            long factorial = 1;

            // Compute factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + number + " is " + factorial);
        } else {
            System.out.println("Please enter a non-negative integer.");
        }

        // Close the scanner stream
        sc.close();
    }
}