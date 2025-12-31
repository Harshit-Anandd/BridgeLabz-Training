package com.bridgelabz.objectmodelling.levelone;

import java.util.ArrayList;
import java.util.List;
public class Bank {
    private String name;
    private List<String> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void openAccount(Customer customer) {
        String accId = "ACC-" + (accounts.size() + 100);
        accounts.add(accId);
        customer.setAccountNumber(accId); // Communication
        System.out.println("Account opened for " + customer.getName() + " in " + this.name + ". ID: " + accId);
    }

    public String getName() { 
    	return name; 
    }
}