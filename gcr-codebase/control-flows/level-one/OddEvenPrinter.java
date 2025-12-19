//Create a class OddEvenPrinter that takes a natural number as input and prints whether each number from 1 to that number is odd or even.

import java.util.Scanner;
public class OddEvenPrinter {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get input
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number > 0) {
            // Iterate from 1 to number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }
        } else {
            System.out.println("Please enter a natural number.");
        }

        // Close the scanner stream
        sc.close();
    }
}