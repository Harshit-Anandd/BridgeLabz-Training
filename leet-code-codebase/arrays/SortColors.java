// Solution for LeetCode #75

class Solution {
    public void sortColors(int[] nums) {
        // Dutch National Flag algorithm
        int low = 0;        // Pointer for 0s
        int mid = 0;        // Pointer for 1s
        int high = nums.length - 1; // Pointer for 2s
        
        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap with low pointer
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // Leave 1s in the middle
                mid++;
            } else { // nums[mid] == 2
                // Swap with high pointer
                swap(nums, mid, high);
                high--;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}