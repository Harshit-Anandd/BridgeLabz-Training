package com.bridgelabz.encapsulation;

public class CurrentAccount extends BankAccount {
    public CurrentAccount(String acc, String name, double bal) { super(acc, name, bal); }

    @Override
    public void calculateInterest() {
        System.out.println("No interest for Current Account.");
    }
}