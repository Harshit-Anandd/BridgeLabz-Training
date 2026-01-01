// Solution for LeetCode #560

import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        // HashMap to store prefix sums and their frequencies
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        
        int count = 0;
        int prefixSum = 0;
        
        // Initialize with prefix sum 0 occurring once
        prefixSumMap.put(0, 1);
        
        for (int num : nums) {
            prefixSum += num;
            
            // If (prefixSum - k) exists in map, we found subarrays summing to k
            if (prefixSumMap.containsKey(prefixSum - k)) {
                count += prefixSumMap.get(prefixSum - k);
            }
            
            // Update frequency of current prefix sum
            prefixSumMap.put(prefixSum, prefixSumMap.getOrDefault(prefixSum, 0) + 1);
        }
        
        return count;
    }
}