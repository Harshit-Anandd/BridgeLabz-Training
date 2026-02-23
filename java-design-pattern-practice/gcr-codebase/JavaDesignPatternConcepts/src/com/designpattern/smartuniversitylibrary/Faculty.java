package com.designpattern.smartuniversitylibrary;
public class Faculty implements User {

    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public void showRole() {
        System.out.println(name + " is a Faculty (Extended borrowing)");
    }

    public void update(String message) {
        System.out.println(name + " notified: " + message);
    }
}
