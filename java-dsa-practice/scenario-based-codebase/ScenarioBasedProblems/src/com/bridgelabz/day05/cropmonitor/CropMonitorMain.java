package com.bridgelabz.day05.cropmonitor;
import java.util.Scanner;

public class CropMonitorMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SensorReading[] readings = new SensorReading[100];
        int count = 0;
        boolean running = true;

        while (running) {

            System.out.println("\n------ Crop Monitor Menu ------");
            System.out.println("1. Add sensor reading");
            System.out.println("2. Sort readings by timestamp");
            System.out.println("3. Display readings");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter timestamp: ");
                    long ts = sc.nextLong();

                    System.out.print("Enter temperature: ");
                    double temp = sc.nextDouble();

                    readings[count++] = new SensorReading(ts, temp);
                    break;

                case 2:
                	CropMonitor.quickSort(readings, 0, count - 1);
                    System.out.println("Sensor data sorted.");
                    break;

                case 3:
                    for (int i = 0; i < count; i++) {
                        System.out.println(readings[i]);
                    }
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting Crop Monitor.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}