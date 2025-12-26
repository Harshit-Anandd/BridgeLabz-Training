// Solution for LeetCode #268

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        // Calculate expected sum using formula: n*(n+1)/2
        int expectedSum = n * (n + 1) / 2;
        
        // Calculate actual sum
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        
        // Missing number is difference between expected and actual sum
        return expectedSum - actualSum;
        
        // Alternative solution using XOR 
        // int xor = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     xor ^= i ^ nums[i];
        // }
        // return xor ^ nums.length;
    }
}