package com.bridgelabz.objectmodelling.levelone;

public class EProduct {
    private String name;
    private double price;

    public EProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String toString() { 
    	return name + " ($" + price + ")";
    }
}