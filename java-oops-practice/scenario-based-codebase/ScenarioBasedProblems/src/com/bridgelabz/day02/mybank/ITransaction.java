package com.bridgelabz.day02.mybank;

// 1. Interface: Transaction Contract
public interface ITransaction {
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}