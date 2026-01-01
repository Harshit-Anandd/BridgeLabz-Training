package com.bridgelabz.encapsulation;

public class Car extends Vehicle implements Insurable {
    private String policyNumber; // Encapsulated sensitive field

    public Car(String num, double rate, String policy) {
        super(num, "Car", rate);
        this.policyNumber = policy;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() { return 500.0; } // Flat rate per rental

    @Override
    public String getInsuranceDetails() { return "Policy: " + policyNumber; }
}