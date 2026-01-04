package com.bridgelabz.day01.smarthomeapplication;

// 4. Concrete Class: AC (Complex logic)
public class AirConditioner extends Appliance {
    private int temperature;

    public AirConditioner(String name) {
        super(name, 1500); // 1500 Watts
        this.temperature = 24; // Default temp
    }

    @Override
    public void turnOn() {
        if (checkPowerSupply()) {
            this.isOn = true;
            logAction("ON. Cooling to " + temperature + "°C");
        }
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        logAction("OFF. Compressor shutting down...");
    }

    // Helper method specific to AC
    private boolean checkPowerSupply() {
        // Simulation logic
        return true; 
    }
    
    // Additional functionality
    public void setTemperature(int temp) {
        if (isOn && temp >= 16 && temp <= 30) {
            this.temperature = temp;
            System.out.println("[" + deviceName + "] Temp set to " + temperature + "°C");
        } else {
            System.out.println("Error: Cannot set temp (Device OFF or Invalid Range)");
        }
    }

    @Override
    public String getStatus() {
        return deviceName + ": " + (isOn ? "Cooling (" + temperature + "C)" : "OFF");
    }
}