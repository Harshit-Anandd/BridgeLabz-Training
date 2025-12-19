//Create class PowerCalculatorFor that calculates the power of a user-input base number raised to a user-input exponent using a for loop.

import java.util.Scanner;
public class PowerCalculatorFor {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get inputs
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        int result = 1;

        // Loop to calculate power
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }

        System.out.println(number + " to the power of " + power + " is " + result);

        // Close the scanner stream
        sc.close();
    }
}