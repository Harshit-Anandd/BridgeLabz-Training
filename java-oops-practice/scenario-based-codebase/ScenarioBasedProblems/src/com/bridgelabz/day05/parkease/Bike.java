package com.bridgelabz.day05.parkease;

// 3. Derived Vehicles
public class Bike extends Vehicle {
    public Bike(String num) { super(num); }

    @Override
    public double calculateCharges(int hours) {
        return hours * 20; // Rs. 20 per hour
    }
}