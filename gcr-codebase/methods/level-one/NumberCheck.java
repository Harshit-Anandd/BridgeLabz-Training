// Create class NumberCheck that contains a method to check if a number is positive, negative, or zero.

import java.util.Scanner;
public class NumberCheck {

    // Method to check number sign
    // Returns 1 for positive, -1 for negative, 0 for zero
    public int checkNumber(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Create NumberCheck object and check the number
        NumberCheck checker = new NumberCheck();
        int result = checker.checkNumber(number);

        // Display result based on return value
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        
        // Close the scanner stream
        sc.close();
    }
}