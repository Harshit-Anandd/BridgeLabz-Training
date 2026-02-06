package com.smartcity;

//Emergency transport
public class AmbulanceService implements TransportService, EmergencyService {

	public String getName() { 
		return "Ambulance"; 
	}
	public String getRoute() { 
		return "Emergency";
	}
	public double getFare() { 
		return 0; 
	}
}
