package com.smartcity;
import java.util.*;
import java.util.stream.Collectors;

//Main application
public class SmartCityMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<TransportService> services = Arrays.asList(
				new BusService(),
				new MetroService(),
				new TaxiService(),
				new AmbulanceService()
				);

		List<PassengerTrip> trips = Arrays.asList(
				new PassengerTrip("Alice", "A-B", 20, true),
				new PassengerTrip("Bob", "B-C", 40, false),
				new PassengerTrip("John", "A-B", 20, true),
				new PassengerTrip("Eve", "A-C", 120, false)
				);

		int choice;

		do {
			System.out.println("\nSMART CITY DASHBOARD");
			System.out.println("1. Show Services");
			System.out.println("2. Filter Cheapest Service");
			System.out.println("3. Revenue Summary");
			System.out.println("4. Trips by Route");
			System.out.println("5. Peak vs Non-Peak Trips");
			System.out.println("6. Emergency Services");
			System.out.println("0. Exit");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				// forEach + method reference
				services.forEach(
						TransportService::printServiceDetails);
				break;

			case 2:
				services.stream()
				.sorted(Comparator.comparing(
						TransportService::getFare))
				.limit(1)
				.forEach(
						TransportService::printServiceDetails);
				break;

			case 3:
				// summarizing revenue
				DoubleSummaryStatistics stats =
				trips.stream()
				.collect(Collectors
						.summarizingDouble(
								PassengerTrip::getFare));

				System.out.println("Total Revenue: "
						+ stats.getSum());
				System.out.println("Average Fare: "
						+ stats.getAverage());
				break;

			case 4:
				// grouping by route
				trips.stream()
				.collect(Collectors.groupingBy(
						PassengerTrip::getRoute))
				.forEach((route, list) ->
				System.out.println(route
						+ " Trips: "
						+ list.size()));
				break;

			case 5:
				// partitioning peak/non-peak
				trips.stream()
				.collect(Collectors.partitioningBy(
						PassengerTrip::isPeakTime))
				.forEach((peak, list) ->
				System.out.println(
						(peak ? "Peak" :
							"Non-Peak")
						+ " Trips: "
						+ list.size()));
				break;

			case 6:
				services.stream()
				.filter(s ->
				s instanceof EmergencyService)
				.forEach(
						TransportService
						::printServiceDetails);
				break;

			case 0:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid option");
			}

		} while (choice != 0);
		
		sc.close();
	}
}
