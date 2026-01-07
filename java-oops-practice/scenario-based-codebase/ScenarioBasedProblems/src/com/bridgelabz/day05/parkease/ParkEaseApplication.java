package com.bridgelabz.day05.parkease;

// --- Main Execution ---
class ParkEaseApplication {
    public static void main(String[] args) {
        ParkingSlot slot1 = new ParkingSlot(101, "Car");
        ParkingSlot slot2 = new ParkingSlot(102, "Bike");

        Vehicle myCar = new Car("MH-12-AB-1234");
        Vehicle myBike = new Bike("KA-05-XY-9999");

        // Successful Parking
        slot1.parkVehicle(myCar);
        
        // Mismatch Type Parking (Car trying to park in Bike slot)
        slot2.parkVehicle(myCar); 

        // Correct Bike Parking
        slot2.parkVehicle(myBike);

        // Exit Logic
        System.out.println("\n--- Exiting ---");
        slot1.vacateSlot(3); // 3 hours * 50 = 150
        slot2.vacateSlot(5); // 5 hours * 20 = 100
    }
}