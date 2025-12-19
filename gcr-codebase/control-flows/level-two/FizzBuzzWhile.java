//Create class FizzBuzzWhile that prints numbers from 1 to a user-input positive integer.

import java.util.Scanner;
public class FizzBuzzWhile {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check for positive integer
        if (number > 0) {
            int i = 1;
            // While loop from 1 to number
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++; // Increment counter
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Close the scanner stream
        sc.close();
    }
}