// Create class NumberCheckerFive that checks for perfect, abundant, deficient, and strong numbers.

import java.util.Scanner;
public class NumberCheckerFive {

    // Get sum of all proper divisors (all divisors except the number itself)
    public static int getSumDivisors(int n) {
        int sum = 0;
        // Add all divisors up to n/2
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        
        // Return the sum of divisors
        return sum;
    }

    // Check if number is perfect (sum of divisors equals the number)
    public static boolean isPerfect(int n) {
        // Return true if sum of divisors equals n
        return getSumDivisors(n) == n;
    }

    // Check if number is abundant (sum of divisors is greater than the number)
    public static boolean isAbundant(int n) {
        // Return true if sum of divisors is greater than n
        return getSumDivisors(n) > n;
    }

    // Check if number is deficient (sum of divisors is less than the number)
    public static boolean isDeficient(int n) {
        // Return true if sum of divisors is less than n
        return getSumDivisors(n) < n;
    }

    // Calculate factorial of a number
    public static int factorial(int n) {
        if (n == 0) return 1;
        int fact = 1;
        // Multiply all numbers from 1 to n
        for (int i = 1; i <= n; i++) fact *= i;
        
        // Return the factorial
        return fact;
    }

    // Check if number is strong (sum of factorials of digits equals the number)
    public static boolean isStrong(int n) {
        int sum = 0;
        int temp = n;
        // Sum the factorial of each digit
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        
        // Return true if sum equals original number
        return sum == n;
    }

    public static void main(String[] args) {

        // Create Scanner for input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check and display number properties
        System.out.println("Perfect: " + isPerfect(n));
        System.out.println("Abundant: " + isAbundant(n));
        System.out.println("Deficient: " + isDeficient(n));
        System.out.println("Strong: " + isStrong(n));
        
        // Close the scanner stream
        sc.close();
    }
}