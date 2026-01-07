package com.bridgelabz.searching.binarysearch.peakelement;

public class PeakElement {
    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid is less than next, we are on upward slope -> peak is to the right
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                // We are on downward slope -> peak is mid or left
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println("Peak Index: " + findPeakElement(nums)); // Output: 2
    }
}