package com.day01.bankmanagement;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    // Shared data structure
    private Map<Integer, Integer> accounts = new HashMap<>();

    public Bank() {
        // Initialize accounts
        accounts.put(101, 10000);
        accounts.put(102, 15000);
        accounts.put(103, 20000);
    }

    /**
     * Synchronized deposit method.
     * Ensures only one thread modifies the account at a time.
     */
    public synchronized void deposit(int accountNumber, int amount) {

        int currentBalance = accounts.get(accountNumber);

        System.out.println(Thread.currentThread().getName() +
                " depositing ₹" + amount + " to Account " + accountNumber);

        currentBalance += amount;

        accounts.put(accountNumber, currentBalance);

        System.out.println("Updated Balance (Account " +
                accountNumber + "): ₹" + currentBalance);
    }

    /**
     * Synchronized withdrawal method.
     * Prevents race condition and overdraft issues.
     */
    public synchronized void withdraw(int accountNumber, int amount) {

        int currentBalance = accounts.get(accountNumber);

        System.out.println(Thread.currentThread().getName() +
                " attempting withdrawal ₹" + amount +
                " from Account " + accountNumber);

        if (currentBalance >= amount) {

            try {
                Thread.sleep(500); // Simulate processing delay
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

            currentBalance -= amount;
            accounts.put(accountNumber, currentBalance);

            System.out.println("Withdrawal successful. Remaining Balance (Account "
                    + accountNumber + "): ₹" + currentBalance);

        } else {
            System.out.println("Insufficient Balance in Account " + accountNumber);
        }
    }

    /**
     * Synchronized balance retrieval.
     */
    public synchronized int getBalance(int accountNumber) {
        return accounts.get(accountNumber);
    }
}