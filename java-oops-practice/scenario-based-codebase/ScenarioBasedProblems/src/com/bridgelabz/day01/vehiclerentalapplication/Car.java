package com.bridgelabz.day01.vehiclerentalapplication;

//3. Subclass: Car
public class Car extends Vehicle {
	private boolean isLuxury;

	public Car(String vehicleNo, double baseRate, boolean isLuxury) {
	    super(vehicleNo, baseRate);
	    this.isLuxury = isLuxury;
	}

 @Override
 public double calculateRent(int days) {
     if (!isValidRental(days)) return 0;
     
     double cost = baseRate * days;
     // Business Logic: 20% surcharge for luxury cars
     return isLuxury ? cost * 1.20 : cost;
 }
}