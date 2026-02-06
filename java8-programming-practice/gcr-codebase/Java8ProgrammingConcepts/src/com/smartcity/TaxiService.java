package com.smartcity;

public class TaxiService implements TransportService {

	public String getName() { 
		return "Taxi"; 
	}
	public String getRoute() { 
		return "A-C"; 
	}
	public double getFare() { 
		return 120; 
	}
}
