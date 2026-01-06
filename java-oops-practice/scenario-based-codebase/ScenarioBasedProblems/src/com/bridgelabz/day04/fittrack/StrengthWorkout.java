package com.bridgelabz.day04.fittrack;

// 5. Derived Class: Strength
public class StrengthWorkout extends Workout {
    private int repetitions;

    public StrengthWorkout(int duration, int reps) {
        super("Strength Training", duration);
        this.repetitions = reps;
    }

    @Override
    public int calculateCalories(double userWeight) {
        // Formula: Different logic based on reps
        return (int) (repetitions * 0.5 + (durationInMinutes * 3));
    }
}