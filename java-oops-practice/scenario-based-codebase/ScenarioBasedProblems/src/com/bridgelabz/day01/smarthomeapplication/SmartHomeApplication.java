package com.bridgelabz.day01.smarthomeapplication;

// --- Main Execution ---
public class SmartHomeApplication {
    public static void main(String[] args) {
        SmartHomeController home = new SmartHomeController();

        Light livingRoomLight = new Light("Living Room LED");
        AirConditioner masterBedAC = new AirConditioner("Master Bedroom AC");

        home.addDevice(livingRoomLight);
        home.addDevice(masterBedAC);

        // Turn everything ON
        home.masterSwitch(true);

        // Specific AC adjustment
        masterBedAC.setTemperature(20);

        // Show Status
        home.showDashboard();
        
        // Turn everything OFF
        home.masterSwitch(false);
    }
}