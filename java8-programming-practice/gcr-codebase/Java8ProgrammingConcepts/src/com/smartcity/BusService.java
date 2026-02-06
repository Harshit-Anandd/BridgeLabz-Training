package com.smartcity;

public class BusService implements TransportService {

	public String getName() { 
		return "City Bus"; 
	}
	public String getRoute() { 
		return "A-B";
	}
	public double getFare() {
		return 20;
	}
}
