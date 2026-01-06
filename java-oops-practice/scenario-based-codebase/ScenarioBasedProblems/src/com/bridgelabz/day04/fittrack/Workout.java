package com.bridgelabz.day04.fittrack;

// 3. Base Workout Class
public abstract class Workout implements Trackable {
    protected String type;
    protected int durationInMinutes;

    public Workout(String type, int duration) {
        this.type = type;
        this.durationInMinutes = duration;
    }

    // Abstract method: Different workouts burn calories differently
    public abstract int calculateCalories(double userWeight);

    @Override
    public void startWorkout() {
        System.out.println("Starting " + type + "...");
    }

    @Override
    public void stopWorkout() {
        System.out.println("Completed " + type + "!");
    }
}