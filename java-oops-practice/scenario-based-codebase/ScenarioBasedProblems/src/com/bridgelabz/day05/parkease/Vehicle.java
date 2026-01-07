package com.bridgelabz.day05.parkease;

// 2. Base Class: Vehicle
public abstract class Vehicle implements Payable {
    protected String vehicleNumber;
    
    public Vehicle(String num) {
        this.vehicleNumber = num;
    }
    
    public String getNumber() { return vehicleNumber; }
}