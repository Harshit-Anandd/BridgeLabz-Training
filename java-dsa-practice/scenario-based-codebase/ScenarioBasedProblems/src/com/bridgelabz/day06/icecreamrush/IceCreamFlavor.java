package com.bridgelabz.day06.icecreamrush;

public class IceCreamFlavor {
    String name;
    int soldCount;

    IceCreamFlavor(String name, int soldCount) {
        this.name = name;
        this.soldCount = soldCount;
    }

    public String toString() {
        return name + " | Sold: " + soldCount;
    }
}