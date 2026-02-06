package com.smartcity;

public interface TransportService {

	String getName();
	String getRoute();
	double getFare();

	// Default method shared by all services
	default void printServiceDetails() {
		System.out.println(getName()
				+ " | Route: " + getRoute()
				+ " | Fare: " + getFare());
	}
}
