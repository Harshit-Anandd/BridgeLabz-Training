package com.bridgelabz.day06.fleetmanager;

public class Vehicle {
    String vehicleId;
    int mileage;

    Vehicle(String vehicleId, int mileage) {
        this.vehicleId = vehicleId;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return vehicleId + " | Mileage: " + mileage;
    }
}