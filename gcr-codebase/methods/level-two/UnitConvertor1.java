// Create class UnitConvertor1 to convert distances between different units

import java.util.Scanner;
public class UnitConvertor1 {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371; 

        // Return converted value
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934; 

        // Return converted value
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084; 

        // Return converted value
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048; 

        // Return converted value
        return feet * feet2meters;
    }

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Distance Converter ---");

        // Input and Convert Km to Miles
        System.out.print("Enter distance in Km: ");
        double km = sc.nextDouble();
        System.out.println(km + " km is " + convertKmToMiles(km) + " miles.");

        // Input and Convert Miles to Km
        System.out.print("Enter distance in Miles: ");
        double miles = sc.nextDouble();
        System.out.println(miles + " miles is " + convertMilesToKm(miles) + " km.");

        // Input and Convert Meters to Feet
        System.out.print("Enter distance in Meters: ");
        double meters = sc.nextDouble();
        System.out.println(meters + " meters is " + convertMetersToFeet(meters) + " feet.");

        // Input and Convert Feet to Meters
        System.out.print("Enter distance in Feet: ");
        double feet = sc.nextDouble();
        System.out.println(feet + " feet is " + convertFeetToMeters(feet) + " meters.");

        // Close the scanner stream 
        sc.close();
    }
}