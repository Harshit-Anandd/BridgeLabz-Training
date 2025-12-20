//Create class LargestDigitsDynamic that takes a number as input and finds the largest digit using dynamic array resizing.

import java.util.Scanner;
public class LargestDigitsDynamic {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner sc = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        
        // Dynamic array resizing to store digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        
        // Extract digits and store in array with dynamic resizing
        while (number > 0) {

            // Resize array if needed
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }

            // Store digit
            digits[index++] = (int)(number % 10);
            number /= 10;
        }

        // Find largest and second largest digits
        int largest = -1, secondLargest = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Print the results
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);

        // Close the scanner stream
        sc.close();
    }
}