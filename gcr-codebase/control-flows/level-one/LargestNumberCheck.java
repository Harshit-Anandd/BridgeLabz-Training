//Create class LargestNumberCheck that checks which of the three input numbers is the largest using boolean variables.

import java.util.Scanner;
public class LargestNumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get input for 3 numbers
        System.out.print("Enter number 1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = sc.nextInt();
        System.out.print("Enter number 3: ");
        int number3 = sc.nextInt();

        // Check for the largest number
        boolean firstIsLargest = (number1 >= number2) && (number1 >= number3);
        boolean secondIsLargest = (number2 >= number1) && (number2 >= number3);
        boolean thirdIsLargest = (number3 >= number1) && (number3 >= number2);

        // Print results
        System.out.println("Is the first number the largest? " + (firstIsLargest ? "Yes" : "No"));
        System.out.println("Is the second number the largest? " + (secondIsLargest ? "Yes" : "No"));
        System.out.println("Is the third number the largest? " + (thirdIsLargest ? "Yes" : "No"));

        // Close the scanner stream
        sc.close();
    }
}