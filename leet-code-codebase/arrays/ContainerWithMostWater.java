// Solution for LeetCode #11

class Solution {
    public int maxArea(int[] height) {
        // Two pointers approach: start from both ends
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        
        while (left < right) {
            // Calculate area: width * min(height[left], height[right])
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int currentArea = width * minHeight;
            
            // Update maxArea if current area is larger
            maxArea = Math.max(maxArea, currentArea);
            
            // Move pointer with smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxArea;
    }
}