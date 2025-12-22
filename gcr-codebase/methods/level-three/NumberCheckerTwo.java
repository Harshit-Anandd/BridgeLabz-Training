// Create class NumberCheckerTwo that checks for Harshad numbers, sums of digits and squares, and digit frequency.

import java.util.Scanner;
public class NumberCheckerTwo {

    // Extract digits from a number and store in array
    public static int[] getDigits(int number) {
        String s = String.valueOf(number);
        int[] digits = new int[s.length()];
        // Convert each character to numeric value
        for(int i=0; i<s.length(); i++) digits[i] = Character.getNumericValue(s.charAt(i));
        
        // Return the array of digits
        return digits;
    }

    // Find sum of all digits
    public static int sumDigits(int[] digits) {
        int sum = 0;
        // Add all digits
        for (int d : digits) sum += d;
        
        // Return the sum
        return sum;
    }

    // Find sum of squares of all digits
    public static int sumSquaresDigits(int[] digits) {
        int sum = 0;
        // Add squares of all digits
        for (int d : digits) sum += Math.pow(d, 2);
        
        // Return the sum
        return sum;
    }

    // Check if number is a Harshad number (divisible by sum of its digits)
    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumDigits(digits);
        
        // Return true if number is divisible by sum of digits
        return (number % sum == 0);
    }

    // Find and display frequency of each digit
    public static void displayDigitFrequency(int[] digits) {
        // Create frequency array for digits 0-9
        int[][] frequency = new int[10][2]; // 0-9 digits
        for (int i = 0; i < 10; i++) frequency[i][0] = i; // Initialize digits

        // Count frequency of each digit
        for (int d : digits) {
            frequency[d][1]++;
        }

        // Display frequency results
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1]);
            }
        }
    }

    public static void main(String[] args) {

        // Create Scanner for input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Get digits from number
        int[] digits = getDigits(number);

        // Display calculations
        System.out.println("Sum of Digits: " + sumDigits(digits));
        System.out.println("Sum of Squares: " + sumSquaresDigits(digits));
        System.out.println("Is Harshad Number: " + isHarshad(number, digits));
        displayDigitFrequency(digits);
        
        // Close the scanner stream
        sc.close();
    }
}