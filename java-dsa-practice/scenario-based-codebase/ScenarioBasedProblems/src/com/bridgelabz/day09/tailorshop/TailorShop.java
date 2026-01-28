package com.bridgelabz.day09.tailorshop;
import java.util.Scanner;

public class TailorShop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Order[] orders = new Order[30];
        int count = 0;
        boolean running = true;

        while (running) {
            System.out.println("\n1.Add Order  2.Display Orders  3.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Order ID: ");
                    String id = sc.nextLine();
                    System.out.print("Deadline (days): ");
                    int d = sc.nextInt();

                    orders[count++] = new Order(id, d);
                    OrderSorter.insertionSort(orders, count);
                    break;

                case 2:
                    for (int i = 0; i < count; i++)
                        System.out.println(orders[i]);
                    break;

                case 3:
                    running = false;
            }
        }
        sc.close();
    }
}