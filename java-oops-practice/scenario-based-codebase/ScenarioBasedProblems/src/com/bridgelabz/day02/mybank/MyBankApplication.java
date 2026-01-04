package com.bridgelabz.day02.mybank;

// --- Main Execution ---
public class MyBankApplication {
    public static void main(String[] args) {
        System.out.println("--- MyBank System ---");

        // 1. Savings Account Test
        SavingsAccount savings = new SavingsAccount("SAV-101", "Anjali", 5000, 4.0); // 4% Interest
        savings.deposit(2000); // Balance: 7000
        savings.withdraw(3000); // Balance: 4000
        savings.checkBalance();
        savings.calculateInterest(); // Should be 4% of 4000 = 160

        System.out.println("\n---------------------");

        // 2. Current Account Test
        CurrentAccount current = new CurrentAccount("CUR-909", "Tech Solutions Ltd", 10000, 5000);
        current.withdraw(12000); // Valid (uses 2000 overdraft)
        current.checkBalance();  // Balance: -2000
        current.calculateInterest(); // No interest
        
        // 3. Overdraft Failure Test
        current.withdraw(10000); // Should fail (Remaining overdraft is only 3000)
    }
}