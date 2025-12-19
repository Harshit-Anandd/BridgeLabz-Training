//Create class RocketLaunchFor that takes a natural number as input and prints a countdown from that number to 1 using a for loop.

import java.util.Scanner;
public class RocketLaunchFor {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get start value for countdown
        System.out.print("Enter countdown start value: ");
        int startValue = sc.nextInt();

        // Countdown using for loop
        System.out.println("Rocket Launch Countdown:");
        for (int i = startValue; i >= 1; i--) {
            System.out.println(i);
        }

        // Close the scanner stream
        sc.close();
    }
}