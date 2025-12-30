//Create class Vehicle to demonstrate instance and class variables, and methods.

package com.bridgelabz.instanceandclass;

public class Vehicle {

    // Instance variables to store vehicle information
    private String ownerName;
    private String vehicleType;

    // Class variable - shared by all instances
    private static double registrationFee = 500.0;

    // Constructor to initialize vehicle with owner name and type
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Fee: $" + registrationFee);
    }

    // Class method to update registration fee for all vehicles
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method to test Vehicle class
    public static void main(String[] args) {

        // Create first vehicle instance
        Vehicle v1 = new Vehicle("Mike", "Car");
        v1.displayVehicleDetails();

        // Update registration fee for all vehicles
        Vehicle.updateRegistrationFee(600.0);
        System.out.println("\nAfter Fee Update:");

        // Create second vehicle instance
        Vehicle v2 = new Vehicle("Lisa", "Bike");
        v2.displayVehicleDetails();

        // Display v1 details again - shows updated fee
        v1.displayVehicleDetails();
    }
}