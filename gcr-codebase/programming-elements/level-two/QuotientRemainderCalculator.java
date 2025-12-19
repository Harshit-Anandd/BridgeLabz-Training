// Create a Java program to calculate the Quotient and Remainder of two numbers

import java.util.Scanner;
public class QuotientRemainderCalculator {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Take user input for two numbers
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        // Calculate Quotient and Remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Print the output
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + number1 + " and " + number2);
            
        // Close the scanner stream
        sc.close();
    }
}