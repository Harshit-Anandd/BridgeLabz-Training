package com.bridgelabz.hashmap.subarraywithzerosum;

import java.util.List;

public class ZeroSumMain {

    public static void main(String[] args) {
        int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        List<int[]> out = ZeroSumSubarray.findSubArrays(arr);
        for (int[] p : out) {
            System.out.println("Subarray found from Index " + p[0] + " to " + p[1]);
        }
    }
    
}