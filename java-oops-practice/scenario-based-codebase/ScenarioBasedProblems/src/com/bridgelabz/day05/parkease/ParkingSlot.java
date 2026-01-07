package com.bridgelabz.day05.parkease;

// 4. Parking Slot Class
public class ParkingSlot {
    private int slotId;
    private String typeAllowed; // "Car" or "Bike"
    // Encapsulation: Status is private
    private boolean isOccupied; 
    private Vehicle currentVehicle;

    public ParkingSlot(int id, String type) {
        this.slotId = id;
        this.typeAllowed = type;
        this.isOccupied = false;
    }

    public boolean parkVehicle(Vehicle v) {
        // Validation: Check if slot is free and type matches
        String vehicleType = v.getClass().getSimpleName(); // Gets "Car" or "Bike"
        
        if (!isOccupied && vehicleType.equals(typeAllowed)) {
            this.currentVehicle = v;
            this.isOccupied = true;
            System.out.println("Vehicle " + v.getNumber() + " parked at Slot " + slotId);
            return true;
        } else {
            System.out.println("Slot " + slotId + " unavailable or invalid type.");
            return false;
        }
    }

    public void vacateSlot(int hoursParked) {
        if (isOccupied && currentVehicle != null) {
            double bill = currentVehicle.calculateCharges(hoursParked);
            System.out.println("Vehicle " + currentVehicle.getNumber() + " left Slot " + slotId);
            System.out.println("Bill Amount: Rs. " + bill);
            
            // Reset Slot
            this.currentVehicle = null;
            this.isOccupied = false;
        } else {
            System.out.println("Slot is already empty.");
        }
    }
}