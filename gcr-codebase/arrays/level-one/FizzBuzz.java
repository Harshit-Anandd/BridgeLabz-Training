//Create class FizzBuzz to implement the FizzBuzz logic and store results in an array.

import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {

        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Initialize an array to store results
        String[] results = new String[number + 1];
        
        // Implement FizzBuzz logic and store results in the array
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }
        
        // Print the results
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        // Close the scanner stream
        sc.close();
    }
}