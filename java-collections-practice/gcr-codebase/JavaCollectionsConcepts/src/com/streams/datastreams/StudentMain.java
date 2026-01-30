package com.streams.datastreams;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentRepository repo = new StudentRepository();

		while(true) {
			System.out.println("\n--- Student Data System ---");
			System.out.println("1. Add Student");
			System.out.println("2. View All");
			System.out.println("3. Exit");
			System.out.print("Choice: ");
			int choice = sc.nextInt();

			if(choice == 3) break;

			switch(choice) {
			case 1:
				System.out.print("Roll No: "); int roll = sc.nextInt();
				System.out.print("Name: "); String name = sc.next();
				System.out.print("GPA: "); double gpa = sc.nextDouble();
				repo.addStudent(roll, name, gpa);
				break;
			case 2:
				repo.displayAllStudents();
				break;
			}
		}
		sc.close();
	}
}