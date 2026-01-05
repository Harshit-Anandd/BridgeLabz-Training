package com.bridgelabz.linkedlist.inventorymanagementsystem;

public class ItemNode {
    int itemId;
    String itemName;
    int quantity;
    double price;
    ItemNode next;

    public ItemNode(int id, String name, int qty, double prc) {
        this.itemId = id;
        this.itemName = name;
        this.quantity = qty;
        this.price = prc;
        this.next = null;
    }
}