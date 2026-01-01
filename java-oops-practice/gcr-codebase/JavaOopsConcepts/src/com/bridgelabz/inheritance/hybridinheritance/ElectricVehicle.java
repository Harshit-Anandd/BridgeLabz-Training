package com.bridgelabz.inheritance.hybridinheritance;

public class ElectricVehicle extends VehicleBase {
    public ElectricVehicle(String model, int speed) { super(model, speed); }
    
    public void charge() {
        System.out.println(model + " is charging...");
    }
}