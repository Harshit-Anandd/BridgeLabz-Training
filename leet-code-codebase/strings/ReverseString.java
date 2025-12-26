// Solution for LeetCode #344

class Solution {
    public void reverseString(char[] s) {
        // Two-pointer approach to reverse in place
        int left = 0;
        int right = s.length - 1;
        
        // Swap characters from both ends until pointers meet
        while (left < right) {
            // Temporary variable for swapping
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            // Move pointers towards center
            left++;
            right--;
        }
    }
}