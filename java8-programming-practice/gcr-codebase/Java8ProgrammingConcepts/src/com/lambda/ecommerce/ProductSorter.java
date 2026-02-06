package com.lambda.ecommerce;
import java.util.*;

public class ProductSorter {

	public static void main(String[] args) {

		List<Product> products = Arrays.asList(
				new Product("Laptop", 70000, 4.5, 10),
				new Product("Phone", 40000, 4.8, 15),
				new Product("Tablet", 30000, 4.2, 5)
				);

		Scanner sc = new Scanner(System.in);
		System.out.println("Sort by: 1.Price 2.Rating 3.Discount");
		int choice = sc.nextInt();

		if (choice == 1)
			products.sort((a, b) -> Double.compare(a.getPrice(), b.getPrice()));
		else if (choice == 2)
			products.sort((a, b) -> Double.compare(b.getRating(), a.getRating()));
		else
			products.sort((a, b) -> Double.compare(b.getDiscount(), a.getDiscount()));

		products.forEach(System.out::println);
		
		sc.close();
	}
}