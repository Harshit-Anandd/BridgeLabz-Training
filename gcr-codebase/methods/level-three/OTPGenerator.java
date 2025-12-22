// Create class OTPGenerator that generates random 6-digit OTPs and checks for uniqueness.

import java.util.Scanner;
import java.util.Arrays;
public class OTPGenerator {

    // Generate a random 6-digit OTP
    public static int generateOTP() {
        // Generate random number between 100000 and 999999
        return (int) (Math.random() * 900000) + 100000;
    }

    // Check if all OTPs are unique
    public static boolean areUnique(int[] otps) {
        // Sort OTPs for comparison
        Arrays.sort(otps);
        // Check for consecutive equal values
        for (int i = 0; i < otps.length - 1; i++) {
            if (otps[i] == otps[i + 1]) return false;
        }
        
        // Return true if all OTPs are unique
        return true;
    }

    public static void main(String[] args) {

        // Create Scanner for input
        Scanner sc = new Scanner(System.in);
        int[] otps = new int[10];

        // Generate 10 random OTPs
        System.out.println("Generating 10 OTPs...");
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        // Check and display uniqueness result
        if (areUnique(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs found.");
        }
        
        // Close the scanner stream
        sc.close();
    }
}