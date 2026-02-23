package com.multithreading.bankingsystem;
public class BankingService {
    public void processTransactions() {
        BankAccount account = new BankAccount();
        Thread t1 = new Thread(new Transaction(account,"Customer-1",3000));
        Thread t2 = new Thread(new Transaction(account,"Customer-2",4000));
        Thread t3 = new Thread(new Transaction(account,"Customer-3",2000));
        Thread t4 = new Thread(new Transaction(account,"Customer-4",5000));
        Thread t5 = new Thread(new Transaction(account,"Customer-5",1500));
        t1.start(); t2.start(); t3.start(); t4.start(); t5.start();
    }
}