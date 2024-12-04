package org.example;

import java.util.Stack;

public class LargestRectangleInHistogram {

    public static void main(String[] args) {
            int[] n={2,1,5,6,2,3};
        int area = getArea(n);
        System.out.println(area);
    }

    public static  int getArea(int[] heights){
        int n=heights.length;
        int maxArea=0;

        Stack<Integer> st=new Stack<>();

        for (int i=0;i<=n;i++){
        int currentHeight=(i==n)? 0:heights[i];

        while (!st.isEmpty() && currentHeight<heights[st.peek()]){
            int height=heights[st.pop()];
            int width=(st.isEmpty() ? i:i-st.peek()-1);

            maxArea=Math.max(maxArea,height*width);
        }
        st.push(i);


        }
return maxArea;
    }
}
