package com.smartcity;

public class MetroService implements TransportService {

	public String getName() { 
		return "Metro"; 
	}
	public String getRoute() { 
		return "B-C";
	}
	public double getFare() {
		return 40;
	}
}
