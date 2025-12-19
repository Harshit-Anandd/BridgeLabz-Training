//Create class GreatestFactorFor that finds the greatest factor of a user-input positive integer (besides itself) using a for loop.

import java.util.Scanner;
public class GreatestFactorFor {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int greatestFactor = 1; // Default greatest factor is 1

        // Loop backward from number - 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break; // Exit loop once the largest factor is found
            }
        }

        System.out.println("The greatest factor of " + number + " beside itself is: " + greatestFactor);

        // Close the scanner stream
        sc.close();
    }
}