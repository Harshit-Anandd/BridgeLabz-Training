package com.bridgelabz.day02.cabbygo;

// --- Main Execution ---
public class CabbyGoApplication {
    public static void main(String[] args) {
        // Setup Fleet
        Vehicle miniCar = new Mini("KA-01-M-1111");
        Vehicle suvCar = new SUV("MH-02-S-9999");
        
        Driver driver1 = new Driver("Ramesh", "DL-98765");
        Driver driver2 = new Driver("Suresh", "DL-12345");

        // Scenario 1: Booking a Mini
        RideManager ride1 = new RideManager(miniCar, driver1);
        ride1.bookRide("Airport", 15.5); // 15.5 km
        ride1.endRide();

        // Scenario 2: Booking an SUV
        RideManager ride2 = new RideManager(suvCar, driver2);
        ride2.bookRide("Hill Station", 50.0); // 50 km
        ride2.endRide();
    }
}