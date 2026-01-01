package com.bridgelabz.encapsulation;

public class Auto extends RideVehicle implements GPS {
    private String location;

    public Auto(String id, String driver, double rate) {
        super(id, driver, rate);
        this.location = "Hub";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String newLoc) { this.location = newLoc; }
}