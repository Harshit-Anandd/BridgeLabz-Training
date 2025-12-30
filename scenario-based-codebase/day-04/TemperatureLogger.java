// Create class TemperatureLogger that accepts temperatures for 7 days, calculates the average temperature and identifies the hottest day.

import java.util.Scanner;
public class TemperatureLogger {

	public static void main(String[] args) {

		// Create a Scanner Object
		Scanner sc = new Scanner(System.in);

		// Array to store temperatures for 7 days
		double[] temperatures = new double[7];
		double sum = 0;

		// Initialize with lowest possible value to ensure any real temp is higher
		double maxTemp = Double.MIN_VALUE;

		System.out.println("--- Weekly Temperature Logger ---");

		// Input Loop to accept temperature for each day
		for (int i = 0; i < temperatures.length; i++) {
			System.out.print("Enter temperature for Day " + (i + 1) + " (°C): ");
			temperatures[i] = sc.nextDouble();

			// Accumulate sum for calculating average
			sum += temperatures[i];

			// Check and update for maximum temperature
			if (temperatures[i] > maxTemp) {
				maxTemp = temperatures[i];
			}
		}

		// Calculate the average temperature for the week
		double averageTemp = sum / temperatures.length;

		// Output Report
		System.out.println("\n--- Weekly Report ---");
		System.out.printf("Average Temperature: %.2f°C\n", averageTemp);
		System.out.println("Hottest Day Temperature: " + maxTemp + "°C");

		// Categorization based on average temperature
		if (averageTemp > 35) {
			System.out.println("Warning: It was a very hot week!");
		} else if (averageTemp < 10) {
			System.out.println("Note: It was a cold week.");
		}

		// Close the scanner stream
		sc.close();
	}
}