package com.bridgelabz.day02.cabbygo;

// 5. Ride Manager (The Logic Core)
public class RideManager implements IRideService {
    private Vehicle vehicle;
    private Driver driver;
    // Encapsulation: Fare and destination are sensitive per trip
    private double currentFare;
    private String currentDestination;
    private boolean isRideActive;

    public RideManager(Vehicle vehicle, Driver driver) {
        this.vehicle = vehicle;
        this.driver = driver;
        this.isRideActive = false;
    }

    @Override
    public void bookRide(String destination, double distanceKm) {
        if (isRideActive) {
            System.out.println("Error: Driver is currently busy.");
            return;
        }
        
        this.currentDestination = destination;
        this.isRideActive = true;
        
        // Polymorphism: Calculates fare based on whether vehicle is Mini, Sedan, or SUV
        this.currentFare = vehicle.calculateFare(distanceKm);
        
        System.out.println("\n--- Ride Booked! ---");
        System.out.println("Driver: " + driver.getName());
        System.out.println("Vehicle: " + vehicle.getDetails());
        System.out.println("Destination: " + destination);
        System.out.println("Estimated Fare: Rs. " + currentFare);
    }

    @Override
    public void endRide() {
        if (!isRideActive) {
            System.out.println("No active ride to end.");
            return;
        }
        System.out.println("Ride Completed. Payment collected: Rs. " + currentFare);
        this.isRideActive = false;
        this.currentFare = 0;
    }
}