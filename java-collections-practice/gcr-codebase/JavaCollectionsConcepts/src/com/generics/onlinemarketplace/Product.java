package com.generics.onlinemarketplace;

//Generic class restricted to a category
public class Product<T extends ProductCategory> {
 private String name;
 private double price;
 private T category;

 public Product(String name, double price, T category) {
     this.name = name;
     this.price = price;
     this.category = category;
 }

 public double getPrice() { return price; }
 public void setPrice(double price) { this.price = price; }
 public String getName() { return name; }
 
 @Override
 public String toString() {
     return name + " (" + category.getCategoryName() + ") - $" + price;
 }
}