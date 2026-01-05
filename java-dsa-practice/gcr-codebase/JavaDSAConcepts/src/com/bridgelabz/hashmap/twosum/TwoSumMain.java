package com.bridgelabz.hashmap.twosum;

import java.util.Arrays;

public class TwoSumMain {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = TwoSum.twoSum(nums, target);
        System.out.println("Indices: " + Arrays.toString(result));
    }
    
}