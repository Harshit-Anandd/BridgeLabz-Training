package com.bridgelabz.day01.vehiclerentalapplication;

// 2. Abstract Base Class
public abstract class Vehicle implements Rentable {
    // Protected: Accessible to subclasses (Car, Bike, Truck)
    protected String vehicleNo;
    protected double baseRate;

    public Vehicle(String vehicleNo, double baseRate) {
        this.vehicleNo = vehicleNo;
        this.baseRate = baseRate;
    }

    // Helper Method: Validate Input
    protected boolean isValidRental(int days) {
        if (days <= 0) {
            System.out.println("Error: Days must be greater than 0");
            return false;
        }
        return true;
    }
}