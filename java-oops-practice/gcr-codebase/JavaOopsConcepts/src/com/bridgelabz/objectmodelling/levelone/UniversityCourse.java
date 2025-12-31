package com.bridgelabz.objectmodelling.levelone;

public class UniversityCourse {
    private String title;
    private UniversityProfessor professor;

    public UniversityCourse(String title) {
        this.title = title;
    }

    public void assignProfessor(UniversityProfessor p) {
        this.professor = p;
        System.out.println("Professor " + p.getName() + " assigned to " + title);
    }

    public String getTitle() { 
    	return title;
    }
}