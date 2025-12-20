//Create class MeanHeight that takes the heights of 11 players as input, stores them in an array, and calculates and displays the mean height.

import java.util.Scanner;
public class MeanHeight {
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Number of players
        int teamSize = 11;

        // Array to store heights
        double[] heights = new double[teamSize];

        // Variable to store the sum of heights
        double sum = 0;
        
        // Input heights from the user
        System.out.println("Enter heights for " + teamSize + " players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + " height: ");

            // Validate input
            while (!sc.hasNextDouble()) {
                System.out.println("Invalid input.");
                sc.next();
            }
            heights[i] = sc.nextDouble();

            // Add height to sum
            sum += heights[i];
        }
        
        // Calculate and display mean height
        double mean = sum / teamSize;
        System.out.println("Mean height: " + mean);

        // Close the scanner stream
        sc.close();
    }
}