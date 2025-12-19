//Create class GreatestFactorWhile that finds the greatest factor of a user-input positive integer (besides itself) using a while loop.

import java.util.Scanner;
public class MultiplesWhile {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int counter = 100;

        // Loop while counter >= 1
        while (counter >= 1) {
            // Check if counter is a multiple of number
            if (counter % number == 0) {
                System.out.println(counter + " is a multiple of " + number);
            }
            counter--;
        }

        // Close the scanner stream
        sc.close();
    }
}