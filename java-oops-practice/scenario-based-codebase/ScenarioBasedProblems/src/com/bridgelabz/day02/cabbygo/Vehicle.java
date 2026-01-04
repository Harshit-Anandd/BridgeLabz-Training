package com.bridgelabz.day02.cabbygo;

// 2. Base Class: Vehicle
public abstract class Vehicle {
    protected String vehicleNumber;
    protected int capacity;
    protected String type;

    public Vehicle(String vehicleNumber, int capacity, String type) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
    }

    // Abstract method to be implemented by specific cars
    public abstract double calculateFare(double distance);
    
    public String getDetails() {
        return type + " (" + vehicleNumber + ")";
    }
}