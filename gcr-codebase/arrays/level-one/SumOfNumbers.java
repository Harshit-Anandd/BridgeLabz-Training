//Create class SumOfNumbers that reads up to 10 numbers from the user into an array, stopping early if the user enters 0 or a negative number, then calculates and displays the total sum of the entered numbers.

import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Array to store numbers
        double[] numbers = new double[10];

        // Variable to store total sum
        double total = 0.0;

        // Index for the array
        int index = 0;
        
        // Prompt user for input
        System.out.println("Enter numbers (enter 0 or negative to stop):");
        
        // Input loop
        while (true) {

            // Check if array is full
            if (index == numbers.length) {
                System.out.println("Array is full.");
                break;
            }
            
            // Read input
            System.out.print("Enter value: ");

            // Validate input
            while (!sc.hasNextDouble()) {
                System.out.println("Invalid input.");
                sc.next();
            }
            double input = sc.nextDouble();
            
            // Check for stopping condition
            if (input <= 0) { 
                break;
            }
            
            // Store number in array
            numbers[index] = input;
            index++;
        }
        
        // Calculate total
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }
        
        // Display total sum
        System.out.println("Total sum: " + total);

        // Close the scanner stream
        sc.close();
    }
}