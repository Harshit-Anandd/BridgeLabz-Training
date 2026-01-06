package com.bridgelabz.day04.fittrack;

// --- Main Execution ---
public class FitTrackApplicaiton {
    public static void main(String[] args) {
        UserProfile user = new UserProfile("Maya", 65.0, 500); // 65kg, 500 cal goal

        Workout run = new CardioWorkout(30, 1.5); // 30 mins, High intensity
        Workout gym = new StrengthWorkout(45, 100); // 45 mins, 100 reps

        // Tracking Logic
        run.startWorkout();
        int cal1 = run.calculateCalories(user.getWeight());
        run.stopWorkout();
        System.out.println("Burned: " + cal1);

        gym.startWorkout();
        int cal2 = gym.calculateCalories(user.getWeight());
        gym.stopWorkout();
        System.out.println("Burned: " + cal2);

        // Total
        user.checkProgress(cal1 + cal2);
    }
}