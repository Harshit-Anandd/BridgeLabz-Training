package com.bridgelabz.day02.cabbygo;

// 3. Concrete Vehicle Types (Polymorphism)
public class Sedan extends Vehicle {
    private final double RATE_PER_KM = 15.0;
    private final double BASE_FARE = 50.0;

    public Sedan(String vehicleNumber) {
        super(vehicleNumber, 4, "Sedan");
    }

    @Override
    public double calculateFare(double distance) {
        return BASE_FARE + (distance * RATE_PER_KM);
    }
}