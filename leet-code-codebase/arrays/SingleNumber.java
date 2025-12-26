// Solution for LeetCode #136

class Solution {
    public int singleNumber(int[] nums) {
        // XOR property: a ^ a = 0, a ^ 0 = a
        // XOR all numbers - duplicates cancel out
        int result = 0;
        
        // XOR all elements in array
        for (int num : nums) {
            result ^= num;
        }
        
        return result;
    }
}