package com.bridgelabz.day04.zipzipmart;

public class Sale {
    int amount;

    Sale(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Amount: " + amount;
    }
}