//Create class FactorsWhile that prints all factors of a given number using a while loop

import java.util.Scanner;
public class FactorsWhile {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int i = 1;
        // Loop while i < number
        while (i < number) {
            if (number % i == 0) {
                System.out.println(i + " is a factor of " + number);
            }
            i++;
        }

        // Close the scanner stream
        sc.close();
    }
}