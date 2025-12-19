//Create class SumOfNaturalNumbers that takes a natural number as input and calculates the sum of all natural numbers up to that number.

import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if it is a natural number (positive integer > 0)
        if (number > 0) {
            // Calculate sum using formula n*(n+1)/2
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }

        // Close the scanner stream
        sc.close();
    }
}