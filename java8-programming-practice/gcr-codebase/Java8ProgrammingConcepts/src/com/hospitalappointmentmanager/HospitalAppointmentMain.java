package com.hospitalappointmentmanager;
import java.time.LocalDate;
import java.util.*;

//Main application class
public class HospitalAppointmentMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Appointment> data = Arrays.asList(
				new Appointment("Alice", "Dr Rao",
						"Cardiology",
						LocalDate.of(2025, 8, 10)),
				new Appointment("Bob", "Dr Rao",
						"Cardiology",
						LocalDate.of(2025, 8, 11)),
				new Appointment("Charlie", "Dr Mehta",
						"Neurology",
						LocalDate.of(2025, 8, 12)),
				new Appointment("David", "Dr Singh",
						"Orthopedics",
						LocalDate.of(2025, 8, 13))
				);

		AppointmentService service =
				new AppointmentService(data);

		int choice;

		do {
			System.out.println("\nHospital Appointment Manager");
			System.out.println("1. Show All Appointments");
			System.out.println("2. Filter by Doctor");
			System.out.println("3. Group by Doctor");
			System.out.println("4. Count per Department");
			System.out.println("5. Sort by Date");
			System.out.println("0. Exit");

			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {

			case 1:
				service.displayAll();
				break;

			case 2:
				System.out.print("Doctor Name: ");
				String doc = sc.nextLine();

				service.filterByDoctor(doc)
				.forEach(System.out::println);
				break;

			case 3:
				service.groupByDoctor()
				.forEach((d, list) -> {
					System.out.println("\n" + d);
					list.forEach(
							System.out::println);
				});
				break;

			case 4:
				service.countByDepartment()
				.forEach((dept, count) ->
				System.out.println(
						dept + ": " + count));
				break;

			case 5:
				service.sortByDate()
				.forEach(System.out::println);
				break;

			case 0:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid option.");
			}

		} while (choice != 0);
		
		sc.close();
	}
}
