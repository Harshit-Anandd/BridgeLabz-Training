package com.generics.resumescreening;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningApp {
	private static List<Resume<? extends JobRole>> resumeQueue = new ArrayList<>();

	// Wildcard method for processing
	public static void processResumes(List<Resume<? extends JobRole>> resumes) {
		if (resumes.isEmpty()) {
			System.out.println("No resumes to process.");
			return;
		}
		System.out.println("\n--- AI Screening Results ---");
		for (Resume<? extends JobRole> r : resumes) {
			System.out.println("Processing: " + r.getInfo() + " -> [SCREENED]");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n--- AI Resume Screening System ---");
			System.out.println("1. Submit Software Engineer Resume");
			System.out.println("2. Submit Data Scientist Resume");
			System.out.println("3. Submit Product Manager Resume");
			System.out.println("4. Process All Resumes");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");

			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 5) {
				System.out.println("Shutting down AI System.");
				sc.close();
				break;
			}

			if (choice >= 1 && choice <= 3) {
				System.out.print("Enter Candidate Name: ");
				String name = sc.nextLine();

				if (choice == 1) 
					resumeQueue.add(new Resume<>(name, new SoftwareEngineer()));
				else if (choice == 2) 
					resumeQueue.add(new Resume<>(name, new DataScientist()));
				else if (choice == 3) 
					resumeQueue.add(new Resume<>(name, new ProductManager()));

				System.out.println("Resume submitted.");
			} else if (choice == 4) {
				processResumes(resumeQueue);
			} else {
				System.out.println("Invalid Input.");
			}
		}
	}
}