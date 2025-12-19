//Create class RocketLaunchWhile that takes a natural number as input and prints a countdown from that number to 1 using a while loop.

import java.util.Scanner;
public class RocketLaunchWhile {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get start value for countdown
        System.out.print("Enter countdown start value: ");
        int counter = sc.nextInt();

        // Countdown using while loop
        System.out.println("Rocket Launch Countdown:");
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrement counter
        }

        // Close the scanner stream
        sc.close();
    }
}