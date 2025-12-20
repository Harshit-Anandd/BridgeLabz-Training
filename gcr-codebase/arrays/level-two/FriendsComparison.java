//Create class FriendsComparison that compares ages and heights of three friends.

import java.util.Scanner;
public class FriendsComparison {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner sc = new Scanner(System.in);

        // Names of the friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        // Input ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age and height for " + names[i] + ": ");
            ages[i] = sc.nextInt();
            heights[i] = sc.nextDouble();
        }
        
        // Determine youngest and tallest
        int minAge = ages[0];
        double maxHeight = heights[0];
        String youngest = names[0], tallest = names[0];
        
        // Compare ages and heights
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = names[i];
            }
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = names[i];
            }
        }
        
        // Print results
        System.out.println("Youngest: " + youngest);
        System.out.println("Tallest: " + tallest);

        // Close the scanner stream
        sc.close();
    }
}