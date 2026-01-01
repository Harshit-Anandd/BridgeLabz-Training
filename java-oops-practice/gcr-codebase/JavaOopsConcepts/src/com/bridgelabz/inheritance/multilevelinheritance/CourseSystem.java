package com.bridgelabz.inheritance.multilevelinheritance;

import java.util.Scanner;
public class CourseSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Course Name: ");
        String name = sc.nextLine();
        
        // Simulating PaidOnlineCourse creation directly
        PaidOnlineCourse c = new PaidOnlineCourse(name, 10, "Udemy", true, 100.0, 20.0);
        c.displayCourseInfo();
        
        sc.close();
    }
}