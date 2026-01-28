package com.bridgelabz.day07.flashdealz;

public class Product {
    String name;
    int discount;

    Product(String name, int discount) {
        this.name = name;
        this.discount = discount;
    }

    public String toString() {
        return name + " | " + discount + "%";
    }
}