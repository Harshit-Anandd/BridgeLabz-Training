// Solution for LeetCode #15

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Sort array to use two-pointer approach
        Arrays.sort(nums);
        
        // Fix one element and find two others that sum to 0
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Two pointers: left starts after i, right starts at end
            int left = i + 1;
            int right = nums.length - 1;
            int target = -nums[i]; // We need nums[left] + nums[right] = -nums[i]
            
            while (left < right) {
                int sum = nums[left] + nums[right];
                
                if (sum == target) {
                    // Found a triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicates for left pointer
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    
                    // Skip duplicates for right pointer
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    
                    // Move both pointers
                    left++;
                    right--;
                } else if (sum < target) {
                    // Sum is too small, move left pointer right
                    left++;
                } else {
                    // Sum is too large, move right pointer left
                    right--;
                }
            }
        }
        
        return result;
    }
}