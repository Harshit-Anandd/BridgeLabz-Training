// Create class UnitConvertor3 to convert temperature, weight, and volume between different units

import java.util.Scanner;
public class UnitConvertor3 {

    // Method to convert Fahrenheit to Celsius
    // Formula: (F - 32) * 5/9
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Return converted value
        return celsius;
    }

    // Method to convert Celsius to Fahrenheit
    // Formula: (C * 9/5) + 32
    public static double convertCelsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Return converted value
        return fahrenheit;
    }

    // Method to convert Pounds to Kilograms
    // Formula: pounds * 0.453592
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;

        // Return converted value
        return pounds * pounds2kilograms;
    }

    // Method to convert Kilograms to Pounds
    // Formula: kg * 2.20462
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;

        // Return converted value
        return kilograms * kilograms2pounds;
    }

    // Method to convert Gallons to Liters
    // Formula: gallons * 3.78541
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        
        // Return converted value
        return gallons * gallons2liters;
    }

    // Method to convert Liters to Gallons
    // Formula: liters * 0.264172
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;

        // Return converted value
        return liters * liters2gallons;
    }

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Example Usage: Temperature
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        System.out.println("Celsius: " + convertFahrenheitToCelsius(fahrenheit));

        // Example Usage: Weight
        System.out.print("Enter weight in Pounds: ");
        double pounds = sc.nextDouble();
        System.out.println("Kilograms: " + convertPoundsToKilograms(pounds));

        // Example Usage: Volume
        System.out.print("Enter volume in Gallons: ");
        double gallons = sc.nextDouble();
        System.out.println("Liters: " + convertGallonsToLiters(gallons));

        // Close the scanner stream
        sc.close();
    }
}