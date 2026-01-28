package com.bridgelabz.day09.productinventory;

public class ProductNode {
    int sku;
    String productName;
    double price;
    ProductNode left, right;

    ProductNode(int sku, String productName, double price) {
        this.sku = sku;
        this.productName = productName;
        this.price = price;
    }
}