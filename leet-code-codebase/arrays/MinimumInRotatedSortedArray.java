// Solution for LeetCode #153

class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        // If array is not rotated
        if (nums[left] <= nums[right]) {
            return nums[left];
        }
        
        // Binary search for minimum element
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if mid is the minimum
            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            
            // Check if mid+1 is the minimum
            if (mid < nums.length - 1 && nums[mid + 1] < nums[mid]) {
                return nums[mid + 1];
            }
            
            // Decide which half to search
            if (nums[mid] > nums[right]) {
                // Minimum is in right half
                left = mid + 1;
            } else {
                // Minimum is in left half
                right = mid - 1;
            }
        }
        
        return nums[0];
    }
}