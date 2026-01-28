package com.bridgelabz.day07.flashdealz;
import java.util.Scanner;

public class FlashDealz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[100];
        int count = 0;
        boolean running = true;

        while (running) {
            System.out.println("\n1.Add  2.Sort  3.Display  4.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Product: ");
                    String name = sc.nextLine();
                    System.out.print("Discount: ");
                    int d = sc.nextInt();
                    products[count++] = new Product(name, d);
                    break;

                case 2:
                    ProductSorter.quickSort(products, 0, count - 1);
                    break;

                case 3:
                    for (int i = 0; i < count; i++)
                        System.out.println(products[i]);
                    break;

                case 4:
                    running = false;
            }
        }
        sc.close();
    }
}