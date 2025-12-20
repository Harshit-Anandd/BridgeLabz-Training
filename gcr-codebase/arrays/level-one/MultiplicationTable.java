//Create class MultiplicationTable that takes a number as input and displays its multiplication table from 1 to 10 using an array to store the results.

import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        
        // Input number
        System.out.print("Enter a number for multiplication table: ");
        while (!sc.hasNextInt()) {
            System.err.println("Invalid input.");
            sc.next();
        }
        int number = sc.nextInt();
        
        // Array to store results
        int[] table = new int[10];
        
        // Calculate table
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1);
        }
        
        // Display results
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        // Close scanner stream
        sc.close();
    }
}