// Solution for LeetCode #20

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        // Stack to track opening brackets
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            // Push opening brackets
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            // Check closing brackets
            else {
                // If stack is empty, invalid
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                
                // Check if closing bracket matches opening bracket
                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        
        // Stack should be empty if all brackets matched
        return stack.isEmpty();
    }
}