package com.streams.datastreams;
import java.io.*;

public class StudentRepository {
	private final String file = "students.dat";

	public void addStudent(int roll, String name, double gpa) {
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file, true))) {
			dos.writeInt(roll);
			dos.writeUTF(name);
			dos.writeDouble(gpa);
			System.out.println("Student saved.");
		} catch (IOException e) {
			e.printStackTrace(); 
		}
	}

	public void displayAllStudents() {
		try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
			System.out.println("--- Student Records ---");
			while (dis.available() > 0) {
				int r = dis.readInt();
				String n = dis.readUTF();
				double g = dis.readDouble();
				System.out.println("Roll: " + r + " | Name: " + n + " | GPA: " + g);
			}
		} catch (FileNotFoundException e) {
			System.out.println("No records found.");
		} catch (IOException e) { 
			e.printStackTrace(); 
		}
	}
}