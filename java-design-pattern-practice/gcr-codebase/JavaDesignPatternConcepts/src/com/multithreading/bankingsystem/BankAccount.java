package com.multithreading.bankingsystem;
public class BankAccount {
    private int balance = 10000;
    public void withdraw(String customer, int amount) {
        System.out.println("[" + customer + "] Attempting withdrawal: " + amount);
        if (balance >= amount) {
            try { Thread.sleep(500); }
            catch (InterruptedException e) { System.out.println(e.getMessage()); }
            balance -= amount;
            System.out.println("Transaction Successful: " + customer + ", Balance: " + balance);
        } else {
            System.out.println("Transaction Failed: " + customer);
        }
    }
}