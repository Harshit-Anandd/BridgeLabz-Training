package com.bridgelabz.day06.icecreamrush;
import java.util.Scanner;

public class IceCreamRush {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        IceCreamFlavor[] flavors = new IceCreamFlavor[10];
        int count = 0;
        boolean running = true;

        while (running) {
            System.out.println("\n1.Add  2.Sort  3.Display  4.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Flavor: ");
                    String name = sc.nextLine();
                    System.out.print("Sold count: ");
                    int sold = sc.nextInt();
                    flavors[count++] = new IceCreamFlavor(name, sold);
                    break;

                case 2:
                    IceCreamSorter.bubbleSort(flavors, count);
                    System.out.println("Sorted by popularity");
                    break;

                case 3:
                    for (int i = 0; i < count; i++)
                        System.out.println(flavors[i]);
                    break;

                case 4:
                    running = false;
            }
        }
        sc.close();
    }
}