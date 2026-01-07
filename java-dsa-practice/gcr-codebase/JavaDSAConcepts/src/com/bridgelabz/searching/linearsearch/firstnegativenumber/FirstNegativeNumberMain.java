package com.bridgelabz.searching.linearsearch.firstnegativenumber;

public class FirstNegativeNumberMain {
	public static void main(String[] args) {
        int[] numbers = {10, 5, 20, -3, 8, -9};
        int index = FirstNegativeNumber.findFirstNegative(numbers);
        System.out.println("First negative number index: " + index); // Output: 3
    }
}