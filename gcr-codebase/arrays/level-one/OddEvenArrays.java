//Create class OddEvenArrays that takes a natural number as input, stores all odd and even numbers up to that number in separate arrays, and displays both arrays.

import java.util.Scanner;
public class OddEvenArrays {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        
        // Input natural number
        System.out.print("Enter a natural number: ");

        // Validate input
        while (!sc.hasNextInt()) {
            System.err.println("Invalid input.");
            sc.next();
        }

        // Read number
        int number = sc.nextInt();
        
        // Check if natural number
        if (number <= 0) {
            System.out.println("Error: Not a natural number.");
            System.exit(0);
        }
        
        // Arrays to store odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];
        int oddIndex = 0, evenIndex = 0;
        
        // Store odd and even numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }
        
        // Display odd and even numbers
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) System.out.print(oddNumbers[i] + " ");
        
        System.out.print("\nEven numbers: ");
        for (int i = 0; i < evenIndex; i++) System.out.print(evenNumbers[i] + " ");
        
        // Close scanner stream
        sc.close();
    }
}