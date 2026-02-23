package com.day01.bankmanagement;

public class BankService {

    public void startSimulation() {

        Bank bank = new Bank();

        Customer c1 = new Customer(1, 101, bank);
        Customer c2 = new Customer(2, 101, bank);
        Customer c3 = new Customer(3, 102, bank);
        Customer c4 = new Customer(4, 103, bank);

        System.out.println("Initial Balance Account 101: ₹" +
                bank.getBalance(101));

        c1.start();
        c2.start();
        c3.start();
        c4.start();

        try {
            c1.join();
            c2.join();
            c3.join();
            c4.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nFinal Balances:");
        System.out.println("Account 101: ₹" + bank.getBalance(101));
        System.out.println("Account 102: ₹" + bank.getBalance(102));
        System.out.println("Account 103: ₹" + bank.getBalance(103));
    }
}