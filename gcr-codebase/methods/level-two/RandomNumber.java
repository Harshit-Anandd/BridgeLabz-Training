// Create class RandomNumber to generate random numbers and find their statistics

import java.util.Scanner;
public class RandomNumber {

    // Method to generate 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate number between 1000 and 9999
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    // Method to find Average, Min, and Max
    // Returns array: [Average, Min, Max]
    public double[] findAverageMinMax(int[] numbers) {

        // Initialize sum, min, and max
        double sum = 0;
        double min = numbers[0];
        double max = numbers[0];

        // Loop through numbers to calculate sum, min, and max
        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        // Calculate average and store results
        double average = sum / numbers.length;
        double[] results = new double[3];
        results[0] = average;
        results[1] = min;
        results[2] = max;

        // Return the results
        return results;
    }

    public static void main(String[] args) {

        // No user input required for generation, but Scanner logic maintained for consistency
        Scanner sc = new Scanner(System.in);

        // Create instance of RandomNumber
        RandomNumber stats = new RandomNumber();
        
        // Generate array of size 5
        int[] randomNumbers = stats.generate4DigitRandomArray(5);

        // Print generated numbers
        System.out.print("Generated Numbers: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Calculate stats
        double[] results = stats.findAverageMinMax(randomNumbers);

        // Display results
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + (int) results[1]);
        System.out.println("Maximum: " + (int) results[2]);
        
        // Close the scanner stream
        sc.close();
    }
}