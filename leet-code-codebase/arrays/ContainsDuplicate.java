// Solution for LeetCode #217

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();
        
        // Iterate through array
        for (int num : nums) {
            // If number already exists in set, duplicate found
            if (set.contains(num)) {
                return true;
            }
            // Add number to set
            set.add(num);
        }
        
        // No duplicates found
        return false;
    }
}