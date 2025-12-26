// Solution for LeetCode #169

class Solution {
    public int majorityElement(int[] nums) {
        // Boyer-Moore Voting Algorithm
        int count = 0;
        Integer candidate = null;
        
        // Find candidate for majority element
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            // Increment or decrement count based on current number
            count += (num == candidate) ? 1 : -1;
        }
        
        // Problem guarantees majority element exists
        return candidate;
    }
}