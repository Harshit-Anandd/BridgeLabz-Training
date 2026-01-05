package com.bridgelabz.hashmap.givensumpair;

import java.util.HashSet;

public class PairWithGivenSum {
    public static boolean hasPair(int[] arr, int target) {
        // Using HashSet as we only need to check existence (concept similar to HashMap keys)
        HashSet<Integer> visited = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (visited.contains(complement)) {
                System.out.println("Pair found: (" + complement + ", " + num + ")");
                return true;
            }
            visited.add(num);
        }
        return false;
    }

}