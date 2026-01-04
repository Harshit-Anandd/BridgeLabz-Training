package com.bridgelabz.day01.smarthomeapplication;

import java.util.List;
import java.util.ArrayList;

// 5. Controller Class (User Interface)
public class SmartHomeController {
    private List<Controllable> devices = new ArrayList<>();

    public void addDevice(Controllable device) {
        devices.add(device);
    }

    public void masterSwitch(boolean turnOn) {
        System.out.println("\n--- Master Switch: " + (turnOn ? "ON" : "OFF") + " ---");
        for (Controllable device : devices) {
            if (turnOn) device.turnOn();
            else device.turnOff();
        }
    }
    
    public void showDashboard() {
        System.out.println("\n--- Home Dashboard ---");
        for (Controllable device : devices) {
            System.out.println(device.getStatus());
        }
    }
}