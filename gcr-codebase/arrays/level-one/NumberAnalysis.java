// Create class NumberAnalysis that takes input of 5 numbers and for each number, checks whether it is positive, negative, or zero.
// For positive numbers, also check if they are odd or even. Finally, compare the first and last numbers and display which one is greater or if they are equal.

import java.util.Scanner;
public class NumberAnalysis {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Array to store 5 numbers
        int size = 5;
        int[] numbers = new int[size];
        
        // Input loop
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");

            // Validate integer input
            while (!sc.hasNextInt()) {
                System.err.println("Invalid input. Enter an integer.");
                sc.next();
            }
            numbers[i] = sc.nextInt();
        }
        
        // Analysis loop
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num > 0) {
                System.out.print(num + " is Positive");
                if (num % 2 == 0) {
                    System.out.println(" and Even.");
                } else {
                    System.out.println(" and Odd.");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative.");
            } else {
                System.out.println(num + " is Zero.");
            }
        }
        
        // Compare first and last
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        System.out.println("Comparison of First (" + first + ") and Last (" + last + "):");
        if (first == last) { 
            System.out.println("They are equal."); 
        } else if (first > last) { 
            System.out.println("First is greater."); 
        } else {
            System.out.println("First is lesser.");
        }
        
        // Close scanner stream
        sc.close();
    }
}