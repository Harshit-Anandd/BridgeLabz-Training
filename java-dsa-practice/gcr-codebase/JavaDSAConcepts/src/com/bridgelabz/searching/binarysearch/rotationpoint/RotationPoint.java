package com.bridgelabz.searching.binarysearch.rotationpoint;

public class RotationPoint {
    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid is greater than right, smallest is to the right
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                // Smallest is mid or to the left
                right = mid;
            }
        }
        // left == right is the index of the smallest element
        return left; 
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Rotation Point Index: " + findRotationPoint(arr)); // Output: 4 (value 0)
    }
}