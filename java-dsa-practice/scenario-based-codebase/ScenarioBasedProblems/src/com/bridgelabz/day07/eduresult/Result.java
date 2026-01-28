package com.bridgelabz.day07.eduresult;

public class Result {
    String name;
    int marks;

    Result(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " | Marks: " + marks;
    }
}