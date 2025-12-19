// Create class NumberSignCheck that checks if a number is positive, negative, or zero

import java.util.Scanner;
public class NumberSignCheck {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if positive, negative, or zero
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        // Close the scanner stream
        sc.close();
    }
}