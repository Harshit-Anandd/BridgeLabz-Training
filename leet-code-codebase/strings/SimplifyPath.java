// Solution for LeetCode #71

import java.util.*;

class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] components = path.split("/");
        
        for (String component : components) {
            // Skip empty strings and current directory "."
            if (component.isEmpty() || component.equals(".")) {
                continue;
            }
            
            // Handle parent directory ".."
            if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // Push valid directory name
                stack.push(component);
            }
        }
        
        // Build simplified path
        StringBuilder simplified = new StringBuilder();
        
        for (String dir : stack) {
            simplified.append("/").append(dir);
        }
        
        // If stack is empty, return root directory
        return simplified.length() > 0 ? simplified.toString() : "/";
    }
}