//Create class GreatestFactorWhile that finds the greatest factor of a user-input positive integer (besides itself) using a while loop.

import java.util.Scanner;
public class GreatestFactorWhile {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int greatestFactor = 1;
        int counter = number - 1;

        // Loop backward using while
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break; // Exit loop
            }
            counter--;
        }

        System.out.println("The greatest factor of " + number + " beside itself is: " + greatestFactor);

        // Close the scanner stream
        sc.close();
    }
}