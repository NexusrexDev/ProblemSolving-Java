/**
 * Problem name: Valid Parentheses
 * Problem link: https://leetcode.com/problems/valid-parentheses/
 */

package LeetCode;

import java.util.*;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> paraStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                paraStack.push(s.charAt(i));
            else if (s.charAt(i) == ')') {
                if (paraStack.size() > 0 && paraStack.peek() == '(') paraStack.pop();
                else paraStack.push(s.charAt(i));
            } else if (s.charAt(i) == ']') {
                if (paraStack.size() > 0 && paraStack.peek() == '[') paraStack.pop();
                else paraStack.push(s.charAt(i));
            } else if (s.charAt(i) == '}') {
                if (paraStack.size() > 0 && paraStack.peek() == '{') paraStack.pop();
                else paraStack.push(s.charAt(i));
            }
        }

        return paraStack.empty();
    }
}