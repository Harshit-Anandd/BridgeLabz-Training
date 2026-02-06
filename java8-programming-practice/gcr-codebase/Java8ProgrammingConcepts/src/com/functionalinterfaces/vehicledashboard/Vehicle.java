package com.functionalinterfaces.vehicledashboard;
//Base vehicle interface
public interface Vehicle {

	// Default method for speed display
	default void displaySpeed() {
		System.out.println("Vehicle speed displayed.");
	}
}
