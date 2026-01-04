package com.bridgelabz.day01.vehiclerentalapplication;

//--- Main Execution ---
public class RentalApplication {
 public static void main(String[] args) {
     Vehicle myCar = new Car("KA-01-1234", 1000, true);
     Vehicle myTruck = new Truck("MH-04-9999", 3000, 10); // Heavy truck

     System.out.println("Luxury Car Rent (5 days): " + myCar.calculateRent(5));
     System.out.println("Truck Rent (2 days): " + myTruck.calculateRent(2));
 }
}