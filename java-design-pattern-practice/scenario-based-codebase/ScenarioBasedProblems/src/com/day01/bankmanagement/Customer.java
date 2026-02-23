package com.day01.bankmanagement;

public class Customer extends Thread {

    private int customerId;
    private int accountNumber;
    private Bank bank;

    public Customer(int customerId, int accountNumber, Bank bank) {
        this.customerId = customerId;
        this.accountNumber = accountNumber;
        this.bank = bank;
        setName("Customer-" + customerId);
    }

    @Override
    public void run() {

        // Sequence of transactions
        bank.deposit(accountNumber, 1000);
        bank.withdraw(accountNumber, 2000);
        bank.deposit(accountNumber, 500);
        bank.withdraw(accountNumber, 3000);

        System.out.println(getName() +
                " final balance for Account " +
                accountNumber + " = ₹" +
                bank.getBalance(accountNumber));
    }
}