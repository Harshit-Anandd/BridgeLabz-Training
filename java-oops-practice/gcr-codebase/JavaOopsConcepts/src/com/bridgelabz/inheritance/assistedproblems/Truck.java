package com.bridgelabz.inheritance.assistedproblems;

public class Truck extends Vehicle {
    private double loadCapacity;
    public Truck(String model, double speed, double load) {
        super(model, speed);
        this.loadCapacity = load;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Truck, Load Capacity: " + loadCapacity + " tons");
    }
}