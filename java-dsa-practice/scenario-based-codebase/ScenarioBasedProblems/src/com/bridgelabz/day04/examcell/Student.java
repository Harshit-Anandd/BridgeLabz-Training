package com.bridgelabz.day04.examcell;

public class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " | Score: " + score;
    }
}