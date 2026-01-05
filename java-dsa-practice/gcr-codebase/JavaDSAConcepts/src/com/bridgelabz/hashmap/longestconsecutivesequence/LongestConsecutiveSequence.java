package com.bridgelabz.hashmap.longestconsecutivesequence;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int findLongestConseqSubseq(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;

        // Hash all the array elements
        for (int val : arr) set.add(val);

        // Check each possible sequence start
        for (int val : arr) {
            // Only start counting if 'val - 1' is not in the set (start of a sequence)
            if (!set.contains(val - 1)) {
                int currentVal = val;
                int currentStreak = 1;

                while (set.contains(currentVal + 1)) {
                    currentVal++;
                    currentStreak++;
                }
                ans = Math.max(ans, currentStreak);
            }
        }
        return ans;
    }

}