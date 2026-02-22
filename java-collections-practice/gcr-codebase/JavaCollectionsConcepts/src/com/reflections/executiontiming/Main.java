package com.reflections.executiontiming;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PerformanceMeasurer measurer = new PerformanceMeasurer();
		TimeTest testObj = new TimeTest();

		while (true) {
			System.out.println("\n--- Execution Timing ---");
			System.out.println("1. Measure slowMethod");
			System.out.println("2. Measure fastMethod");
			System.out.println("3. Exit");
			System.out.print("Choice: ");
			int choice = sc.nextInt();

			if (choice == 3) {
				break;
			}

			if (choice == 1) {
				measurer.measure(testObj, "slowMethod");
			} else if (choice == 2) {
				measurer.measure(testObj, "fastMethod");
			}
		}
		sc.close();
	}
}