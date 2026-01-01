package com.bridgelabz.inheritance.assistedproblems;

public class Vehicle {
    private String model;
    private double maxSpeed;

    public Vehicle(String model, double maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}