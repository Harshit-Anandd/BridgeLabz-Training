package com.bridgelabz.sorting.quicksort;

import java.util.Arrays;

public class QuickSortMain {

    public static void main(String[] args) {
        int[] productPrices = {999, 499, 1299, 299, 799};
        System.out.println("Original Prices: " + Arrays.toString(productPrices));
        
        ProductPriceSorter.quickSort(productPrices, 0, productPrices.length - 1);
        
        System.out.println("Sorted Prices: " + Arrays.toString(productPrices));
    }
    
}