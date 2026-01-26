package com.bridgelabz.day06.tourmate;

// 5. Derived Class: Domestic Trip
public class DomesticTrip extends Trip {
    public DomesticTrip(String dest, int days, Hotel hotel, Transport transport) {
        super(dest, days, hotel, transport);
    }

    @Override
    public void book() {
        System.out.println("\n--- Booking Domestic Trip to " + destination + " ---");
        System.out.println("1. Booking Transport: " + transport.type);
        System.out.println("2. Reserving Hotel: " + hotel.name);
        System.out.println("Booking Confirmed.");
    }

    @Override
    public void cancel() {
        System.out.println("Cancelling trip to " + destination + ". Full refund initiated.");
    }

    @Override
    public double calculateTotalCost() {
        // Polymorphism: Simple addition + 5% GST
        return super.calculateTotalCost() * 1.05; 
    }
}