package com.bridgelabz.hashmap.subarraywithzerosum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ZeroSumSubarray {
    public static List<int[]> findSubArrays(int[] arr) {
        // Map to store sum and list of indices where this sum occurred
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();
        int sum = 0;

        // Initialize for subarrays starting from index 0
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                // If sum was seen before, subarrays exist between previous indices and current i
                List<Integer> oldIndices = map.get(sum);
                for (int index : oldIndices) {
                    result.add(new int[]{index + 1, i});
                }
            }
            
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
        return result;
    }
}