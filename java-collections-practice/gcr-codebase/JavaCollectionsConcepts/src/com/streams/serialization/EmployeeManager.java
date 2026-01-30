package com.streams.serialization;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
	private List<Employee> employees = new ArrayList<>();
	private final String filename = "employees.ser";

	public void addEmployee(int id, String name, String dept, double salary) {
		employees.add(new Employee(id, name, dept, salary));
		System.out.println("Employee added to list.");
	}

	public void saveToFile() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
			oos.writeObject(employees);
			System.out.println("List serialized to " + filename);
		} catch (IOException e) { 
			e.printStackTrace(); 
		}
	}

	@SuppressWarnings("unchecked")
	public void loadFromFile() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
			employees = (List<Employee>) ois.readObject();
			System.out.println("Employees retrieved from file:");
			for (Employee e : employees) {
				System.out.println(e);
			}
		} catch (IOException | ClassNotFoundException e) { 
			System.out.println("Error loading file: " + e.getMessage()); 
		}
	}
}