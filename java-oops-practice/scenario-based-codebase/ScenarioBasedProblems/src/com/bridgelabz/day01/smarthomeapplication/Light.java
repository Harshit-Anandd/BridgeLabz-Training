package com.bridgelabz.day01.smarthomeapplication;

// 3. Concrete Class: Light (Simple On/Off)
public class Light extends Appliance {
    private int brightness; // 0-100%

    public Light(String name) {
        super(name, 10); // 10 Watts
        this.brightness = 100; // Default max brightness
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        logAction("ON at " + brightness + "% brightness");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        logAction("OFF");
    }

    @Override
    public String getStatus() {
        return deviceName + ": " + (isOn ? "ON (Light)" : "OFF");
    }
}