package com.bridgelabz.day02.cabbygo;

// 3. Concrete Vehicle Types (Polymorphism)
public class Mini extends Vehicle {
    private final double RATE_PER_KM = 10.0;
    private final double BASE_FARE = 30.0;

    public Mini(String vehicleNumber) {
        super(vehicleNumber, 3, "Mini");
    }

    @Override
    public double calculateFare(double distance) {
        return BASE_FARE + (distance * RATE_PER_KM);
    }
}