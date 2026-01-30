package com.generics.universitymanagement;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class UniversityApp {
    private static List<Course<?>> courses = new ArrayList<>();

    // Wildcard method to display course details
    public static void displayCourses(List<? extends Course<?>> courseList) {
        for (Course<?> c : courseList) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- University Course Manager ---");
            System.out.println("1. Add Exam-Based Course");
            System.out.println("2. Add Assignment-Based Course");
            System.out.println("3. Add Research-Based Course");
            System.out.println("4. List All Courses");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 5) {
                System.out.println("Exiting System.");
                sc.close();
                return;
            } else if (choice >= 1 && choice <= 3) {
                System.out.print("Enter Course Name: ");
                String name = sc.nextLine();
                
                if (choice == 1) courses.add(new Course<>(name, new ExamCourse()));
                else if (choice == 2) courses.add(new Course<>(name, new AssignmentCourse()));
                else if (choice == 3) courses.add(new Course<>(name, new ResearchCourse()));
                
                System.out.println("Course added successfully.");
            } else if (choice == 4) {
                displayCourses(courses);
            } else {
                System.out.println("Invalid Option");
            }
        }
    }
}