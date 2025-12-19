//Create class DivisibleByFive that checks if a number is divisible by 5 or not.

import java.util.Scanner;
public class DivisibleByFive {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get integer input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is divisible by 5
        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }

        // Close the scanner stream
        sc.close();
    }
}