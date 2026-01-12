package com.bridgelabz.day01.ambulanceroute;

import java.util.Scanner;

public class AmbulanceRouteMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AmbulanceRoute route = new AmbulanceRoute();
        boolean running = true;

        while (running) {

            System.out.println("\n------ Ambulance Route Menu ------");
            System.out.println("1. Add hospital unit");
            System.out.println("2. Find available unit");
            System.out.println("3. Remove unit (maintenance)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter unit name: ");
                    String name = sc.nextLine();
                    route.addUnit(name);
                    System.out.println("Unit added.");
                    break;

                case 2:
                    HospitalUnit unit = route.findAvailableUnit();
                    if (unit != null) {
                        System.out.println("Redirect patient to: " + unit.name);
                    } else {
                        System.out.println("No units available.");
                    }
                    break;

                case 3:
                    System.out.print("Enter unit name to remove: ");
                    String remove = sc.nextLine();
                    if (route.removeUnit(remove)) {
                        System.out.println("Unit removed.");
                    } else {
                        System.out.println("Unit not found.");
                    }
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting Ambulance Route.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}