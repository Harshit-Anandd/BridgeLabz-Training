package com.bridgelabz.day08.homenest;

// 4. Derived Class: Thermostat (AC)
public class Thermostat extends Device {
    private int temperature;

    public Thermostat(String id, String name) {
        super(id, name, 1500.0); // 1500 Watts
        this.temperature = 24;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println(name + " started. Cooling to " + temperature + "°C");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println(name + " stopped.");
    }

    @Override
    public void reset() {
        // Polymorphism: Thermostat reset involves calibration
        System.out.println("Recalibrating sensors for " + name + "...");
        this.temperature = 24;
        System.out.println("Reset complete.");
    }
}