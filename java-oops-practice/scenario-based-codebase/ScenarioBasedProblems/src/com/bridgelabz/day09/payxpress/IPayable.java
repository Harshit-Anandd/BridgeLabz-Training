package com.bridgelabz.day09.payxpress;

// 1. Interface: Payment Contract
public interface IPayable {
    void pay(double amountPaid);
    void sendReminder();
}