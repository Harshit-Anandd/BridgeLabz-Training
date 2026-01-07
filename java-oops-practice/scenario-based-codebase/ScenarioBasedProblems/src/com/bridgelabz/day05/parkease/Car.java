package com.bridgelabz.day05.parkease;

// 3. Derived Vehicles
public class Car extends Vehicle {
    public Car(String num) { super(num); }

    @Override
    public double calculateCharges(int hours) {
        return hours * 50; // Rs. 50 per hour
    }
}