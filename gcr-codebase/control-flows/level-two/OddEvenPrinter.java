//Create class OddEvenPrinter that prints whether numbers from 1 to a user-input natural number are odd or even.

import java.util.Scanner;
public class OddEvenPrinter {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get integer input from the user
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Check if the number is a natural number (greater than 0)
        if (number <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
        } else {
            // Loop from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Check if the current number i is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        }

        // Close the scanner stream
        sc.close();
    }
}