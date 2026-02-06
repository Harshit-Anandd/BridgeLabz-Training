package com.functionalinterfaces.vehicledashboard;

public class VehicleDashboard {

	public static void main(String[] args) {

		ElectricVehicle ev = new ElectricVehicle();

		ev.displaySpeed();
		ev.displayBattery();
	}
}
