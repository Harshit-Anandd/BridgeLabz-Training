package com.bridgelabz.searching.binarysearch.firstlastoccurrence;

public class FirstLastOccurrence {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = findBound(nums, target, true);  // Find First
        if (result[0] != -1) {
            result[1] = findBound(nums, target, false); // Find Last
        }
        return result;
    }

    private static int findBound(int[] nums, int target, boolean isFirst) {
        int index = -1;
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                index = mid;
                // If finding first, go left; else go right
                if (isFirst) right = mid - 1;
                else left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }
}