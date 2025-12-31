package com.bridgelabz.objectmodelling.levelone;

public class UniversityStudent {
    private String name;

    public UniversityStudent(String name) {
        this.name = name;
    }

    public void enrollCourse(UniversityCourse c) {
        System.out.println("Student " + name + " has enrolled in " + c.getTitle());
    }
}