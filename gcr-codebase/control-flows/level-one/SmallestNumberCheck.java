//Create class SmallestNumberCheck that takes 3 numbers as input and checks if the first number is the smallest among the three.

import java.util.Scanner;
public class SmallestNumberCheck {
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

        // Check if the first number is the smallest
        if (number1 < number2 && number1 < number3) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }

        // Close the scanner stream
        sc.close();
    }
}