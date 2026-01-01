package com.bridgelabz.inheritance.hybridinheritance;

public class VehicleBase {
    protected String model;
    protected int maxSpeed;

    public VehicleBase(String model, int speed) {
        this.model = model;
        this.maxSpeed = speed;
    }
}