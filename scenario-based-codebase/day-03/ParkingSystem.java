// Create class ParkingSystem that manages vehicle parking with capacity tracking and displays current occupancy status.

import java.util.Scanner;
public class ParkingSystem {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the max capacity of the parking lot:");
        final int MAX_CAPACITY = sc.nextInt();
        
        // Variables to track parking status
        int currentOccupancy = 0;
        boolean systemActive = true;

        System.out.println("--- Smart Parking Gate System ---");

        // Main system loop - continues until user shuts down the system
        while (systemActive) {
            System.out.println("\nMENU:");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Exit Vehicle");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Shut Down System");
            System.out.print("Select Option: ");
            
            int choice = sc.nextInt();

            // Process user choice using Enhanced Switch Expression
            switch (choice) {
                case 1 -> {
                    if (currentOccupancy < MAX_CAPACITY) {
                        currentOccupancy++;
                        System.out.println("Gate Open. Vehicle Parked.");
                    } else {
                        System.out.println("SORRY: Parking Lot is FULL!");
                    }
                }
                case 2 -> {
                    if (currentOccupancy > 0) {
                        currentOccupancy--;
                        System.out.println("Gate Open. Vehicle Exited.");
                    } else {
                        System.out.println("Error: The lot is already empty.");
                    }
                }
                case 3 -> {
                    System.out.println("Occupancy: " + currentOccupancy + "/" + MAX_CAPACITY);
                    // Display visual occupancy bar
                    System.out.print("Status: [");
                    for(int i=0; i<MAX_CAPACITY; i++) {
                        System.out.print(i < currentOccupancy ? "X" : "_");
                    }
                    System.out.println("]");
                }
                case 4 -> {
                    System.out.println("Shutting down system...");
                    systemActive = false;
                }
                default -> System.out.println("Invalid Option. Try again.");
            }
        }
        
        // Close the scanner stream
        sc.close();
    }
}