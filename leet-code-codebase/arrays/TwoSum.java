// Solution for LeetCode #1

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap to store number and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if complement exists in map
            if (map.containsKey(complement)) {
                // Return indices of current number and its complement
                return new int[] {map.get(complement), i};
            }
            
            // Add current number and its index to map
            map.put(nums[i], i);
        }
        
        // No solution found (though problem guarantees one)
        return new int[] {-1, -1};
    }
}