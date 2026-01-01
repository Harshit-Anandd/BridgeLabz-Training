// Solution for LeetCode #442

import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        // Mark visited numbers by making the value at index (num-1) negative
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            
            // If the value at index is already negative, we found a duplicate
            if (nums[index] < 0) {
                result.add(index + 1);
            } else {
                // Mark as visited by making it negative
                nums[index] = -nums[index];
            }
        }
        
        return result;
    }
}