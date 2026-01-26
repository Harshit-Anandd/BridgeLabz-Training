package com.bridgelabz.day08.homenest;

// --- Main Execution ---
public class HomeNestApp {
    public static void main(String[] args) {
        Device livingRoomLight = new SmartLight("L-01", "Living Room LED");
        Device masterAC = new Thermostat("T-01", "Master Bedroom AC");

        livingRoomLight.turnOn();
        masterAC.turnOn();
        
        System.out.println("\n--- Performing Reset ---");
        livingRoomLight.reset();
        masterAC.reset();
    }
}