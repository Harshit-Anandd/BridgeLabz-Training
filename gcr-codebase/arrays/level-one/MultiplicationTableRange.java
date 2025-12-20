//Create class MultiplicationTableRange that takes a number as input and displays its multiplication table from 6 to 9 using an array to store the results.

import java.util.Scanner;
public class MultiplicationTableRange {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        
        // Input number
        System.out.print("Enter a number: ");

        // Validate input
        while (!sc.hasNextInt()) {
            System.err.println("Invalid input.");
            sc.next();
        }
        int number = sc.nextInt();
        
        // Array size 4 (for multipliers 6, 7, 8, 9)
        int[] results = new int[4];

        // Starting multiplier
        int startMultiplier = 6;
        
        // Loop 6 to 9 and store results
        for (int i = 0; i < results.length; i++) {
            results[i] = number * (startMultiplier + i);
        }
        
        // Display results
        for (int i = 0; i < results.length; i++) {
            System.out.println(number + " * " + (startMultiplier + i) + " = " + results[i]);
        }

        // Close scanner stream
        sc.close();
    }
}