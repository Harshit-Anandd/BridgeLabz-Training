//Create class SumUntilZero that continuously takes numbers as input from the user and adds them to a total sum until the user enters zero. Finally, it displays the total sum.

import java.util.Scanner;
public class SumUntilZero {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        double total = 0.0;
        double userValue;

        // Get initial input
        System.out.print("Enter a number (0 to stop): ");
        userValue = sc.nextDouble();

        // Loop until user enters 0
        while (userValue != 0) {
            total += userValue;
            
            // Ask for input again
            System.out.print("Enter a number (0 to stop): ");
            userValue = sc.nextDouble();
        }

        // Display total
        System.out.println("The total sum is: " + total);

        // Close the scanner stream
        sc.close();
    }
}