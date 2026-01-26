package com.bridgelabz.day06.tourmate;

// 4. Derived Class: International Trip
public class InternationalTrip extends Trip {
    private double visaFees;
    private double forexRate;

    public InternationalTrip(String dest, int days, Hotel hotel, Transport transport, double visaCost) {
        super(dest, days, hotel, transport);
        this.visaFees = visaCost;
        this.forexRate = 1.05; // 5% markup on forex transactions
    }

    @Override
    public void book() {
        System.out.println("\n--- Booking International Trip to " + destination + " ---");
        System.out.println("1. Checking Passport Validity...");
        System.out.println("2. Processing Visa (Cost: Rs." + visaFees + ")...");
        System.out.println("3. Booking Flight: " + transport.type);
        System.out.println("4. Reserving Hotel: " + hotel.name);
        System.out.println("Booking Confirmed.");
    }

    @Override
    public void cancel() {
        System.out.println("Cancelling trip to " + destination + ". Visa fees are non-refundable.");
    }

    @Override
    public double calculateTotalCost() {
        // Polymorphism: Add Visa fees and Forex markup
        double baseCost = super.calculateTotalCost();
        return (baseCost + visaFees) * forexRate;
    }
}