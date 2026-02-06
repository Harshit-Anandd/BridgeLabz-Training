package com.hospitalappointmentmanager;
import java.util.*;
import java.util.stream.Collectors;

//Service class using Stream API operations
public class AppointmentService {

	private List<Appointment> appointments;

	public AppointmentService(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	// Filter appointments by doctor
	public List<Appointment> filterByDoctor(String doctor) {
		return appointments.stream()
				.filter(a ->
				a.getDoctorName()
				.equalsIgnoreCase(doctor))
				.collect(Collectors.toList());
	}

	// Group appointments by doctor
	public Map<String, List<Appointment>> groupByDoctor() {
		return appointments.stream()
				.collect(Collectors.groupingBy(
						Appointment::getDoctorName));
	}

	// Count appointments per department
	public Map<String, Long> countByDepartment() {
		return appointments.stream()
				.collect(Collectors.groupingBy(
						Appointment::getDepartment,
						Collectors.counting()));
	}

	// Sort appointments by date
	public List<Appointment> sortByDate() {
		return appointments.stream()
				.sorted(Comparator.comparing(
						Appointment::getDate))
				.collect(Collectors.toList());
	}

	// Display all appointments
	public void displayAll() {
		appointments.forEach(System.out::println);
	}
}
