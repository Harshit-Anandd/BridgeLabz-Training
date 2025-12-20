//Create class FactorsArray to find and store factors of a given number in an array.

import java.util.Scanner;
public class FactorsArray {
    public static void main(String[] args) {

        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Initialize an array to store factors
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;
        
        // Find factors and store them in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {

                    // Resize the array if needed
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }
        
        // Print the factors
        System.out.print("Factors: ");
        for (int i = 0; i < index; i++) System.out.print(factors[i] + " ");

        // Close the scanner stream
        sc.close();
    }
}