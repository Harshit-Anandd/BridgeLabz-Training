//Create class FactorialWhile that calculates the factorial of a given positive integer using a while loop.

import java.util.Scanner;
public class FactorialWhile {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Validate input and calculate factorial
        if (number >= 0) {
            long factorial = 1;
            int i = 1;

            // Compute factorial using while loop
            while (i <= number) {
                factorial *= i;
                i++;
            }

            System.out.println("Factorial of " + number + " is " + factorial);
        } else {
            System.out.println("Please enter a non-negative integer.");
        }

        // Close the scanner stream
        sc.close();
    }
}