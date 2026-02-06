package com.functionalinterfaces.inbuiltinterface;
import java.util.function.Function;
import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter message: ");
		String msg = sc.nextLine();

		Function<String, Integer> lengthFunc = String::length;

		System.out.println("Length: " + lengthFunc.apply(msg));

		sc.close();
	}
}
