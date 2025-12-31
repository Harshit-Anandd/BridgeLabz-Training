package com.bridgelabz.objectmodelling.levelone;

import java.util.Scanner;
public class UniversityManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Course Title: ");
        UniversityCourse course = new UniversityCourse(sc.nextLine());

        System.out.print("Enter Professor Name: ");
        UniversityProfessor prof = new UniversityProfessor(sc.nextLine());

        System.out.print("Enter Student Name: ");
        UniversityStudent student = new UniversityStudent(sc.nextLine());

        System.out.println("\n--- System Actions ---");
        course.assignProfessor(prof);
        student.enrollCourse(course);

        sc.close();
    }
}