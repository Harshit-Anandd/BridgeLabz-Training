package com.bridgelabz.inheritance.hybridinheritance;

public class PetrolVehicle extends VehicleBase implements Refuelable {
    public PetrolVehicle(String model, int speed) { super(model, speed); }
    
    @Override
    public void refuel() {
        System.out.println(model + " is refueling at the gas station.");
    }
}