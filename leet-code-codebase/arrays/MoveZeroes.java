// Solution for LeetCode #283

class Solution {
    public void moveZeroes(int[] nums) {
        // Pointer for non-zero elements position
        int nonZeroIndex = 0;
        
        // First pass: move all non-zero elements to front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        
        // Second pass: fill remaining positions with zeros
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}