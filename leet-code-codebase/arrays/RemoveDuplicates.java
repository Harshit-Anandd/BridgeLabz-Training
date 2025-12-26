// Solution for LeetCode #26

class Solution {
    public int removeDuplicates(int[] nums) {
        // Edge case: empty array
        if (nums.length == 0) return 0;
        
        // Pointer for unique elements position
        int uniqueIndex = 0;
        
        // Iterate through array starting from second element
        for (int i = 1; i < nums.length; i++) {
            // If current element is different from previous unique element
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }
        
        // Return count of unique elements
        return uniqueIndex + 1;
    }
}