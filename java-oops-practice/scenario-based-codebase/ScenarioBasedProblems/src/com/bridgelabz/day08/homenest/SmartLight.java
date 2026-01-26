package com.bridgelabz.day08.homenest;

// 3. Derived Class: Light
public class SmartLight extends Device {
    public SmartLight(String id, String name) {
        super(id, name, 10.0); // 10 Watts
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println(name + " is glowing.");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println(name + " is dark.");
    }

    @Override
    public void reset() {
        // Polymorphism: Light reset is simple toggle
        System.out.println("Resetting Light settings to default (Warm White)...");
        turnOff();
        turnOn();
    }
}