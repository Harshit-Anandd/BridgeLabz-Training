//Create class MultiplesFor that prints all multiples of a user-input positive integer from 100 down to 1 using a for loop.

import java.util.Scanner;
public class MultiplesFor {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Loop backwards from 100 to 1
        for (int i = 100; i >= 1; i--) {
            // Check if i is a multiple of number
            if (i % number == 0) {
                System.out.println(i + " is a multiple of " + number);
            }
        }

        // Close the scanner stream
        sc.close();
    }
}