// Create class DigitalWatch that simulates a 24-hour digital watch with power cut at 13:00

public class DigitalWatch {
    public static void main(String[] args) {
        System.out.println("--- Digital Watch Simulation (24H Format) ---");

        // Label outer loop to allow breaking from nested loop
        outerLoop:
        for (int hour = 0; hour < 24; hour++) {

            // Inner loop for minutes (0 to 59)
            for (int minute = 0; minute < 60; minute++) {

                // Print formatted time (e.g., 09:05)
                System.out.printf("%02d:%02d\n", hour, minute);

                // Check for power cut at 13:00
                if (hour == 13 && minute == 0) {
                    System.out.println(" Power Cut! Watch stopped at 13:00.");
                    break outerLoop;
                }
            }
        }
    }
}