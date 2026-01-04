package com.bridgelabz.day01.ewalletapplication;

//1. Interface
public interface Transferrable {
 boolean transferTo(Wallet receiver, double amount);
}