// Create a Java program to check if a number is a Harshad Number or not.

import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get input number
        System.out.print("Enter a number: ");
        int originalNumber = sc.nextInt();

        // Variables for calculation
        int number = originalNumber;
        int sumOfDigits = 0;
        int digit;

        // Calculate sum of digits
        while (number != 0) {
            digit = number % 10;
            sumOfDigits += digit;
            number /= 10;
        }

        // Check divisibility
        if (sumOfDigits != 0 && originalNumber % sumOfDigits == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }

        // Close the scanner stream
        sc.close();
    }
}