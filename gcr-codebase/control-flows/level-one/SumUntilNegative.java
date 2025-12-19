//Create class SumUntilNegative that continuously takes numbers as input from the user and adds them to a total sum until the user enters a negative number or zero. Finally, it displays the total sum.

import java.util.Scanner;
public class SumUntilNegative {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        // Infinite while loop
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double userValue = sc.nextDouble();

            // Check condition to break
            if (userValue <= 0) {
                break;
            }

            // Add to total
            total += userValue;
        }

        // Display total
        System.out.println("The total sum is: " + total);

        // Close the scanner stream
        sc.close();
    }
}