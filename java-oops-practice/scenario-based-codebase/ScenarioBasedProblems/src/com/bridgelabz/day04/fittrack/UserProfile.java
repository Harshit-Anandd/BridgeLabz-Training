package com.bridgelabz.day04.fittrack;

// 2. User Profile (Encapsulation)
public class UserProfile {
    private String name;
    private double weight; // Private: Sensitive data
    private int dailyCalorieGoal;

    public UserProfile(String name, double weight, int goal) {
        this.name = name;
        this.weight = weight;
        this.dailyCalorieGoal = goal;
    }

    public double getWeight() { return weight; }
    
    public void checkProgress(int caloriesBurned) {
        int remaining = dailyCalorieGoal - caloriesBurned;
        System.out.println("Progress: " + caloriesBurned + "/" + dailyCalorieGoal + " kcal");
        if (remaining <= 0) System.out.println("Goal Reached! Great job, " + name + "!");
        else System.out.println("Remaining: " + remaining + " kcal");
    }
}