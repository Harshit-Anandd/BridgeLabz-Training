package com.bridgelabz.linkedlist.inventorymanagementsystem;

public class InventoryManagement {
    ItemNode head = null;

    // 1. Add Item
    public void addItem(int id, String name, int qty, double prc) {
        ItemNode newNode = new ItemNode(id, name, qty, prc);
        if (head == null) {
            head = newNode;
        } else {
            ItemNode temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    // 2. Remove Item
    public void removeItem(int id) {
        if (head == null) return;
        if (head.itemId == id) {
            head = head.next;
            return;
        }
        ItemNode current = head, prev = null;
        while (current != null && current.itemId != id) {
            prev = current;
            current = current.next;
        }
        if (current != null) prev.next = current.next;
    }

    // 3. Update Quantity
    public void updateQuantity(int id, int newQty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
    }

    // 5. Calculate Total Value
    public void calculateTotalValue() {
        double total = 0;
        ItemNode temp = head;
        while (temp != null) {
            total += (temp.quantity * temp.price);
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: $" + total);
    }
    
    // 6. Sort by Name (Simple Bubble Sort for SLL)
    public void sortByName() {
        if(head == null || head.next == null) return;
        boolean swapped;
        do {
            swapped = false;
            ItemNode current = head;
            while(current.next != null) {
                if(current.itemName.compareTo(current.next.itemName) > 0) {
                    // Swap data for simplicity
                    String tName = current.itemName; current.itemName = current.next.itemName; current.next.itemName = tName;
                    int tId = current.itemId; current.itemId = current.next.itemId; current.next.itemId = tId;
                    int tQty = current.quantity; current.quantity = current.next.quantity; current.next.quantity = tQty;
                    double tPrc = current.price; current.price = current.next.price; current.next.price = tPrc;
                    swapped = true;
                }
                current = current.next;
            }
        } while(swapped);
    }

    public void display() {
        ItemNode temp = head;
        while (temp != null) {
            System.out.println(temp.itemName + " - Qty: " + temp.quantity + " - Price: " + temp.price);
            temp = temp.next;
        }
    }
}