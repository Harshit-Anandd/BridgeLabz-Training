package com.smartcity;

public class PassengerTrip {

	private String passenger;
	private String route;
	private double fare;
	private boolean peakTime;

	public PassengerTrip(String passenger,
			String route,
			double fare,
			boolean peakTime) {
		this.passenger = passenger;
		this.route = route;
		this.fare = fare;
		this.peakTime = peakTime;
	}

	public String getRoute() { 
		return route;
	}
	public double getFare() {
		return fare; 
	}
	public boolean isPeakTime() {
		return peakTime; 
	}
}
