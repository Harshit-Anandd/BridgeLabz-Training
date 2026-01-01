package com.bridgelabz.inheritance.assistedproblems;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String lang) {
        super(name, id, salary);
        this.programmingLanguage = lang;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer, Language: " + programmingLanguage);
    }
}