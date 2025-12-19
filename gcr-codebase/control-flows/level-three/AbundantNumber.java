// Create a class AbundantNumber that checks if a number is an Abundant Number or not.

import java.util.Scanner;
public class AbundantNumber {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Variable for sum of divisors
        int sumOfDivisors = 0;

        // Loop from 1 to number-1 to find divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }

        // Check if sum > number
        if (sumOfDivisors > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

        // Close the scanner stream
        sc.close();
    }
}