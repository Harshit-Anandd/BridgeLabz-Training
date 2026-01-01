package com.bridgelabz.inheritance.singleinheritance;

public class Thermostat extends Device {
    private double temperatureSetting;

    public Thermostat(String id, String status, double temp) {
        super(id, status);
        this.temperatureSetting = temp;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}