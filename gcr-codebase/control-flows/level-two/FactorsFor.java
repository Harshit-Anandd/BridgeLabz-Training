//Create class FactorsFor that prints all factors of a given number using a for loop

import java.util.Scanner;
public class FactorsFor {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Loop from 1 to number - 1 (as per hint "i < number")
        // Note: Factors typically include the number itself, but following hint strictly.
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i + " is a factor of " + number);
            }
        }

        // Close the scanner stream
        sc.close();
    }
}