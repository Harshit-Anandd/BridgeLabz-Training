// Create class UnitConvertor2 to convert lengths between different units

import java.util.Scanner;
public class UnitConvertor2 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3.0; 

        // Return converted value
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333; 
        
        // Return converted value
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701; 

        // Return converted value
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254; 

        // Return converted value
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54; 

        // Return converted value
        return inches * inches2cm;
    }

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Length Converter ---");

        // Input and Convert Yards to Feet
        System.out.print("Enter length in Yards: ");
        double yards = sc.nextDouble();
        System.out.println(yards + " yards is " + convertYardsToFeet(yards) + " feet.");

        // Input and Convert Feet to Yards
        System.out.print("Enter length in Feet: ");
        double feet = sc.nextDouble();
        System.out.println(feet + " feet is " + convertFeetToYards(feet) + " yards.");

        // Input and Convert Meters to Inches
        System.out.print("Enter length in Meters: ");
        double meters = sc.nextDouble();
        System.out.println(meters + " meters is " + convertMetersToInches(meters) + " inches.");

        // Input and Convert Inches to Meters
        System.out.print("Enter length in Inches: ");
        double inches = sc.nextDouble();
        System.out.println(inches + " inches is " + convertInchesToMeters(inches) + " meters.");
        System.out.println(inches + " inches is " + convertInchesToCm(inches) + " cm.");

        // Close the scanner stream
        sc.close();
    }
}