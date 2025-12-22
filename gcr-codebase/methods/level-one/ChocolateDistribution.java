// Create class ChocolateDistribution that calculates how many chocolates each child gets and how many are left over

import java.util.Scanner;
public class ChocolateDistribution {

    // Method to find quotient (chocolates per child) and remainder (remaining chocolates)
    public int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {

        // Calculate chocolates per child using division operator
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Return results in an array
        int[] values = new int[2];
        values[0] = chocolatesPerChild;
        values[1] = remainingChocolates;

        // Return the array containing chocolates per child and remaining chocolates
        return values;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Input chocolates
        System.out.print("Enter total number of chocolates: ");
        int chocolates = sc.nextInt();

        // Input children
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        // Validate number of children to avoid division by zero
        ChocolateDistribution dist = new ChocolateDistribution();

        // Get the result array
        int[] result = dist.findRemainderAndQuotient(chocolates, children);

        // Display the results
        System.out.println("Each child gets: " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);
        
        // Close the scanner stream
        sc.close();
    }
}