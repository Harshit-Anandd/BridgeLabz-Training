// Create class TemperatureConverter that converts temperature between Celsius and Fahrenheit

import java.util.Scanner;
public class TemperatureConverter {

	// Method to convert Celsius to Fahrenheit
	public double celsiusToFahrenheit(double c) {
		
		// Return the results
		return (c * 9/5) + 32;
	}

	// Method to convert Fahrenheit to Celsius
	public double fahrenheitToCelsius(double f) {
		
		// Return the results
		return (f - 32) * 5/9;
	}

	public static void main(String[] args) {

		// Create a Scanner object to read input
		Scanner sc = new Scanner(System.in);

		// Display menu
		System.out.println("1. Celsius to Fahrenheit");
		System.out.println("2. Fahrenheit to Celsius");
		System.out.print("Choose option: ");
		int choice = sc.nextInt();

		// Create the object and call the method based on choice
		TemperatureConverter conv = new TemperatureConverter();

		if (choice == 1) {
			System.out.print("Enter Celsius: ");
			double c = sc.nextDouble();
			System.out.println("Fahrenheit: " + conv.celsiusToFahrenheit(c));
		} else if (choice == 2) {
			System.out.print("Enter Fahrenheit: ");
			double f = sc.nextDouble();
			System.out.println("Celsius: " + conv.fahrenheitToCelsius(f));
		}

		// Close the scanner stream
		sc.close();
	}
}