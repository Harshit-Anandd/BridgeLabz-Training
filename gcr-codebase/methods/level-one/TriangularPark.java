// Create class TriangularPark that contains method to calculate number of rounds an athlete must complete to run 5km

import java.util.Scanner;
public class TriangularPark {

    // Method to calculate the number of rounds
    // Takes three sides and total target distance (in meters)
    public double calculateRounds(double side1, double side2, double side3, double totalDistance) {
        // Calculate perimeter
        double perimeter = side1 + side2 + side3;
        
        // Calculate rounds needed
        double rounds = totalDistance / perimeter;

        // Returning the calculated rounds
        return rounds;
    }

    public static void main(String[] args) {
        
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Define fixed variable for target distance (5km = 5000 meters)
        double targetDistanceMeters = 5000.0;

        // Input for side 1
        System.out.print("Enter the first side of the triangle (in meters): ");
        double side1 = sc.nextDouble();

        // Input for side 2
        System.out.print("Enter the second side of the triangle (in meters): ");
        double side2 = sc.nextDouble();

        // Input for side 3
        System.out.print("Enter the third side of the triangle (in meters): ");
        double side3 = sc.nextDouble();

        // Create class object
        TriangularPark parkRun = new TriangularPark();

        // Calculate rounds
        double rounds = parkRun.calculateRounds(side1, side2, side3, targetDistanceMeters);

        // Display result (ceil is used because you need to complete the full distance, usually implying full or partial rounds)
        System.out.println("To run 5km, the athlete must complete " + rounds + " rounds.");

        // Close the scanner object
        sc.close();
    }
}