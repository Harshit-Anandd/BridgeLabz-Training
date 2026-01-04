package com.bridgelabz.day01.smarthomeapplication;

// 2. Base Class: Appliance
public abstract class Appliance implements Controllable {
    protected String deviceName;
    protected boolean isOn;
    protected int powerConsumption; // Watts

    public Appliance(String deviceName, int powerConsumption) {
        this.deviceName = deviceName;
        this.powerConsumption = powerConsumption;
        this.isOn = false; // Default state
    }

    // Common helper method to print status changes
    protected void logAction(String action) {
        System.out.println("[" + deviceName + "] is now " + action);
    }
}