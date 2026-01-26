package com.bridgelabz.day08.homenest;

// 2. Base Class: Device
public abstract class Device implements IControllable {
    protected String deviceId;
    protected String name;
    // Encapsulation: Status and usage are protected/private
    protected boolean isOn;
    protected double energyUsage; // Watts

    public Device(String id, String name, double watts) {
        this.deviceId = id;
        this.name = name;
        this.energyUsage = watts;
        this.isOn = false;
    }

    public void showStatus() {
        System.out.println("[" + name + "] is " + (isOn ? "ON" : "OFF"));
    }

    // Protected method: Only subclasses can log firmware updates
    protected void logFirmwareUpdate(String version) {
        System.out.println("LOG: " + name + " updated to v" + version);
    }
}