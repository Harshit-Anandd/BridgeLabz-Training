package com.bridgelabz.inheritance.singleinheritance;

public class Device {
    private String deviceId;
    private String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}