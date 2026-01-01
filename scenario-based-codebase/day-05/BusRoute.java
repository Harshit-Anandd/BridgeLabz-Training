// Create class BusRoute that tracks the total distance traveled by a passenger on a bus

import java.util.Scanner;
public class BusRoute {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner sc = new Scanner(System.in);

        // Variables to track bus journey
        double totalDistance = 0.0;
        boolean onBus = true;

        System.out.println("--- City Bus Route Tracker ---");

        // Loop for bus stops until passenger gets off
        while (onBus) {
            System.out.print("Enter distance to next stop (km): ");
            double stopDistance = sc.nextDouble();

            // Add to total distance
            totalDistance += stopDistance;

            System.out.println("... Bus Moving ...");
            System.out.println("Arrived at Stop. Total Distance: " + totalDistance + " km");

            System.out.print("Do you want to get off here? (yes/no): ");
            String answer = sc.next();

            // Check if passenger wants to get off
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Passenger Alighted.");
                onBus = false;
            }
        }

        System.out.println("Have a nice day!");

        // Close the scanner stream
        sc.close();
    }
}