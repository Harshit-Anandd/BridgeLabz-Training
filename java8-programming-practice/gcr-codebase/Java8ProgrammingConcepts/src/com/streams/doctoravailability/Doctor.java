package com.streams.doctoravailability;

public class Doctor {

	private String name;
	private String specialty;
	private boolean weekendAvailable;

	public Doctor(String name, String specialty, boolean available) {
		this.name = name;
		this.specialty = specialty;
		this.weekendAvailable = available;
	}

	public boolean isWeekendAvailable() { return weekendAvailable; }
	public String getSpecialty() { return specialty; }

	public String toString() {
		return name + " | " + specialty;
	}
}