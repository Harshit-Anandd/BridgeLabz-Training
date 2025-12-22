// Create class FriendsComparison that compares ages and heights of friends

import java.util.Scanner;
public class FriendsComparison {

    // Method to find the youngest friend (minimum age)
    // Returns the name of the youngest friend
    public String findYoungest(String[] names, int[] ages) {

        // Initialize minAge and youngestName
        int minAge = ages[0];
        String youngestName = names[0];

        // Loop through ages to find the minimum
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestName = names[i];
            }
        }

        // Return the name of the youngest friend
        return youngestName;
    }

    // Method to find the tallest friend (maximum height)
    // Returns the name of the tallest friend
    public String findTallest(String[] names, double[] heights) {

        // Initialize maxHeight and tallestName
        double maxHeight = heights[0];
        String tallestName = names[0];

        // Loop through heights to find the maximum
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestName = names[i];
            }
        }

        // Return the name of the tallest friend
        return tallestName;
    }

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Arrays to store data for 3 friends
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input loop
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i] + ":");
            System.out.print("Age: ");
            ages[i] = sc.nextInt();
            System.out.print("Height (cm): ");
            heights[i] = sc.nextDouble();
        }

        // Create object
        FriendsComparison comparison = new FriendsComparison();

        // Find results
        String youngest = comparison.findYoungest(names, ages);
        String tallest = comparison.findTallest(names, heights);

        // Display results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        // Close the scanner stream
        sc.close();
    }
}