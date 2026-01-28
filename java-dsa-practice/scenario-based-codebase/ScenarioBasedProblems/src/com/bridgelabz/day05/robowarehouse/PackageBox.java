package com.bridgelabz.day05.robowarehouse;

public class PackageBox {
    int weight;

    PackageBox(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Package Weight: " + weight;
    }
}