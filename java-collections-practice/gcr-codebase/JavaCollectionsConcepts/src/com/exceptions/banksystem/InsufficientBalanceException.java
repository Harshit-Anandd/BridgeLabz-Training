package com.exceptions.banksystem;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}