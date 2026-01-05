package com.bridgelabz.hashmap.givensumpair;

public class GivenSumMain {

    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int target = -2;
        if (!PairWithGivenSum.hasPair(arr, target)) 
            System.out.println("No pair found");
    }
    
}