package com.bridgelabz.encapsulation;

public class Cab extends RideVehicle implements GPS {
    private String location;

    public Cab(String id, String driver, double rate) {
        super(id, driver, rate);
        this.location = "Hub";
    }

    @Override
    public double calculateFare(double distance) {
        double baseFare = 50;
        return baseFare + (distance * getRatePerKm());
    }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String newLoc) { this.location = newLoc; }
}