package com.bridgelabz.day01.vehiclerentalapplication;

//4. Subclass: Truck
public class Truck extends Vehicle {
	private double loadCapacityTons;
	public Truck(String vehicleNo, double baseRate, double loadCapacity) {
		super(vehicleNo, baseRate);
		this.loadCapacityTons = loadCapacity;
 }

 @Override
 public double calculateRent(int days) {
     if (!isValidRental(days)) return 0;
     
     double cost = baseRate * days;
     // Business Logic: Extra charge for heavy loads
     if (loadCapacityTons > 5) {
         cost += 500; // Flat extra fee
     }
     return cost;
 }
}