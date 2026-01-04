package com.bridgelabz.day02.cabbygo;

// 3. Concrete Vehicle Types (Polymorphism)
public class SUV extends Vehicle {
    private final double RATE_PER_KM = 25.0;
    private final double BASE_FARE = 80.0;

    public SUV(String vehicleNumber) {
        super(vehicleNumber, 6, "SUV");
    }

    @Override
    public double calculateFare(double distance) {
        return BASE_FARE + (distance * RATE_PER_KM);
    }
}