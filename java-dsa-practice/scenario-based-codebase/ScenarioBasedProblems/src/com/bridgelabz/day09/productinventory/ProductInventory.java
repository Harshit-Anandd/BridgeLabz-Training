package com.bridgelabz.day09.productinventory;
import java.util.Scanner;

public class ProductInventory {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductBST bst = new ProductBST();
        boolean running = true;

        while (running) {

            System.out.println("\n1.Add Product  2.Search  3.Update Price  4.Display Sorted  5.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("SKU: ");
                    int sku = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    bst.insert(sku, name, price);
                    break;

                case 2:
                    System.out.print("Enter SKU: ");
                    ProductNode p = bst.search(sc.nextInt());
                    System.out.println(p != null ? p.productName + " ₹" + p.price : "Not Found");
                    break;

                case 3:
                    System.out.print("SKU: ");
                    int id = sc.nextInt();
                    ProductNode prod = bst.search(id);
                    if (prod != null) {
                        System.out.print("New Price: ");
                        prod.price = sc.nextDouble();
                    }
                    break;

                case 4:
                    bst.displaySorted();
                    break;

                case 5:
                    running = false;
            }
        }
        sc.close();
    }
}