package com.bridgelabz.objectmodelling.levelone;

import java.util.Scanner;
public class ECommerceApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Customer Name: ");
        ECustomer cust = new ECustomer(sc.nextLine());

        Order ord = new Order(101);
        
        // Adding dummy products for demonstration
        ord.addProduct(new EProduct("Laptop", 1200));
        ord.addProduct(new EProduct("Mouse", 25));

        cust.placeOrder(ord);
        cust.showHistory();

        sc.close();
    }
}
