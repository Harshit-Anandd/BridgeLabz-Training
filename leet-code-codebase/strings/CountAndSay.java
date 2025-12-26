// Solution for LeetCode #38

class Solution {
    public String countAndSay(int n) {
        // Base case
        if (n == 1) {
            return "1";
        }
        
        // Recursive call to get previous sequence
        String prev = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();
        
        int count = 1;
        char currentChar = prev.charAt(0);
        
        // Build the count-and-say sequence
        for (int i = 1; i < prev.length(); i++) {
            if (prev.charAt(i) == currentChar) {
                count++;
            } else {
                // Append count and character
                result.append(count).append(currentChar);
                currentChar = prev.charAt(i);
                count = 1;
            }
        }
        
        // Append the last group
        result.append(count).append(currentChar);
        
        return result.toString();
    }
}