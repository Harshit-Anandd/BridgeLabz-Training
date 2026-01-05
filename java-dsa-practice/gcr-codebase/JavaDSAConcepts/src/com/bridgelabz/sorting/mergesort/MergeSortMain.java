package com.bridgelabz.sorting.mergesort;

import java.util.Arrays;

public class MergeSortMain {

    public static void main(String[] args) {
        // Using int for prices as per the style of the study material code [cite: 218]
        int[] bookPrices = {350, 120, 500, 250, 400};
        System.out.println("Original Prices: " + Arrays.toString(bookPrices));
        
        BookPriceSorter.mergeSort(bookPrices, 0, bookPrices.length - 1);
        
        System.out.println("Sorted Prices: " + Arrays.toString(bookPrices));
    }
    
}