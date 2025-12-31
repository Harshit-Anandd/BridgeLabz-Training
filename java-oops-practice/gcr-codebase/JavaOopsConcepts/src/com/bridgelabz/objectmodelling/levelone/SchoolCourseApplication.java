package com.bridgelabz.objectmodelling.levelone;

import java.util.Scanner;
public class SchoolCourseApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        School school = new School("Greenwood High");
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        System.out.print("Enter Student Name: ");
        Student s1 = new Student(sc.nextLine());
        
        school.admitStudent(s1); // Aggregation

        System.out.println("Available Courses: 1. Math, 2. Science, 3. Both");
        System.out.print("Choose enrollment: ");
        int choice = sc.nextInt();

        if (choice == 1 || choice == 3) math.enroll(s1);
        if (choice == 2 || choice == 3) science.enroll(s1);

        System.out.println("\n--- Enrollment Details ---");
        s1.viewCourses();
        sc.close();
    }
}