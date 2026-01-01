package com.bridgelabz.inheritance.multilevelinheritance;

public class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String name, int duration, String platform, boolean rec, double fee, double discount) {
        super(name, duration, platform, rec);
        this.fee = fee;
        this.discount = discount;
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Platform: " + platform + ", Recorded: " + isRecorded);
        System.out.println("Final Fee: $" + (fee - discount));
    }
}