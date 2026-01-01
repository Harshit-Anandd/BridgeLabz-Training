package com.bridgelabz.inheritance.assistedproblems;

public class Car extends Vehicle {
    private int seats;
    public Car(String model, double speed, int seats) {
        super(model, speed);
        this.seats = seats;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Car, Seats: " + seats);
    }
}