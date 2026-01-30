package com.streams.serialization;
import java.util.Scanner;

public class SerializationMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeManager manager = new EmployeeManager();

		while (true) {
			System.out.println("\n--- Serialization System ---");
			System.out.println("1. Add Employee");
			System.out.println("2. Save List to File");
			System.out.println("3. Load List from File");
			System.out.println("4. Exit");
			System.out.print("Choice: ");
			int choice = sc.nextInt();

			if (choice == 4) break;

			switch (choice) {
			case 1:
				System.out.print("ID: "); int id = sc.nextInt();
				System.out.print("Name: "); String name = sc.next();
				System.out.print("Dept: "); String dept = sc.next();
				System.out.print("Salary: "); double sal = sc.nextDouble();
				manager.addEmployee(id, name, dept, sal);
				break;
			case 2: 
				manager.saveToFile(); 
				break;
			case 3: 
				manager.loadFromFile(); 
				break;
			}
		}
		sc.close();
	}
}