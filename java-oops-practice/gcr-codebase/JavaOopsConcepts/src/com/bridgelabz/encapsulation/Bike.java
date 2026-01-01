package com.bridgelabz.encapsulation;

public class Bike extends Vehicle implements Insurable {
    private String policyNumber;

    public Bike(String num, double rate, String policy) {
        super(num, "Bike", rate);
        this.policyNumber = policy;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() { return 100.0; }

    @Override
    public String getInsuranceDetails() { return "Policy: " + policyNumber; }
}