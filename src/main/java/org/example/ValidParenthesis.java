package org.example;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {

        System.out.println(isValidTricky("{}()[]"));
    }


    public static boolean isValidTricky(String str){
        Stack<Character> st=new Stack<>();



        for (Character c : str.toCharArray()) {

        if(c=='(')
            st.push(')');
        else if (c=='{')
            st.push('}');
        else if (c=='[')
            st.push(']');
            else if(st.empty() || st.peek()!=c)
                    return false;
            else
                st.pop();

        }
        return st.empty();

    }

    public static boolean isValid(String str){
        Stack<Character> st=new Stack<>();



        for (Character c : str.toCharArray()) {

            if(st.empty() || c=='(' || c =='{' || c=='['){
                st.push(c);
                continue;
            }

            if(c==')'){
                if(st.peek()=='(')
                    st.pop();
                else
                    return false;
            } else if (c=='}') {
                if(st.peek()=='{')
                    st.pop();
                else
                    return false;
            } else if (c==']') {
                if(st.peek()=='[')
                    st.pop();
                else
                    return false;
            }
        }

        return st.empty();

    }
}

