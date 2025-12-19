//Create class PowerCalculatorWhile that calculates the power of a user-input base number raised to a user-input exponent using a while loop.

import java.util.Scanner;
public class PowerCalculatorWhile {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get inputs
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        int result = 1;
        int counter = 0;

        // Loop until counter equals power
        while (counter < power) {
            result = result * number;
            counter++;
        }

        System.out.println(number + " to the power of " + power + " is " + result);

        // Close the scanner stream
        sc.close();
    }
}