//Create class MultiplicationTable that prints the multiplication table (from 6 to 9) of a user-input positive integer.

import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get the number for the table
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Loop to find multiplication from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close the scanner stream
        sc.close();
    }
}