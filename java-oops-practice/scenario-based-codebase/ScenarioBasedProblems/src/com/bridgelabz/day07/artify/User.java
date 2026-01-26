package com.bridgelabz.day07.artify;
import java.util.ArrayList;
import java.util.List;

// 2. User Class
public class User {
    private String name;
    private double walletBalance;
    private List<String> inventory;

    public User(String name, double balance) {
        this.name = name;
        this.walletBalance = balance;
        this.inventory = new ArrayList<>();
    }

    public boolean deductBalance(double amount) {
        if (walletBalance >= amount) {
            walletBalance -= amount;
            return true;
        }
        System.out.println("Insufficient Funds. Balance: $" + walletBalance);
        return false;
    }

    public void addToInventory(String item) {
        inventory.add(item);
        System.out.println(item + " added to " + name + "'s collection.");
    }
}