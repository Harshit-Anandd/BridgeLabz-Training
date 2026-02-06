package com.streams.doctoravailability;

import java.util.*;

public class DoctorAvailability {

	public static void main(String[] args) {

		List<Doctor> doctors = Arrays.asList(
				new Doctor("Dr Rao", "Cardiology", true),
				new Doctor("Dr Mehta", "Neurology", false),
				new Doctor("Dr Singh", "Orthopedics", true)
				);

		doctors.stream()
		.filter(Doctor::isWeekendAvailable)
		.sorted((a, b) ->
		a.getSpecialty().compareTo(b.getSpecialty()))
		.forEach(System.out::println);
	}
}
