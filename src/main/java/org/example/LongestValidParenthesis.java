package org.example;

import java.util.Stack;

public class LongestValidParenthesis {
    public int longestValidParentheses(String s) {


        Stack<Integer> stack= new Stack<>();
        stack.push(-1);

        int maxLength=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(')
                stack.push(i);
            else{
                stack.pop();

                if (stack.isEmpty()) {
                    stack.push(i); // Set a new base for invalid parentheses
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }


        }
        return maxLength;

    }
}
