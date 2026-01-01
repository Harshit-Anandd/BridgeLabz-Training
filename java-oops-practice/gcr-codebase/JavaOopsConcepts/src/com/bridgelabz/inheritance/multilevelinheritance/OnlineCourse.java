package com.bridgelabz.inheritance.multilevelinheritance;

public class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String name, int duration, String platform, boolean rec) {
        super(name, duration);
        this.platform = platform;
        this.isRecorded = rec;
    }
}