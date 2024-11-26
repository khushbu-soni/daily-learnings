package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RainTrapping {

    public static void main(String[] args) {
        int[] heights=new int[]{4,2,0,3,2,5};

        int trap = trap(heights);

        System.out.println(trap);
    }

    public static int trap(int[] heights){
        int sumOfHeight=0;

        int n=heights.length;

        int[] leftMax=getLeftMax(heights,n);
        int[] rightMax=getRightMax(heights,n);

        for(int i=0;i<n;i++){
            int h =Math.min(leftMax[i],rightMax[i])-heights[i];

            sumOfHeight+=h;
        }

        return sumOfHeight;
    }

    private static int[] getLeftMax(int[] heights, int n) {
        int[] leftMax= new int[n];
         leftMax[0]=heights[0];

        for(int i=1;i<n;i++){
        leftMax[i]=Math.max(leftMax[i-1],heights[i]);
        }

        return leftMax;
    }

    private static int[] getRightMax(int[] heights, int n) {
        int[] rightMax=new int[n];
         rightMax[n-1]=heights[n-1];
        for(int i=n-2;i>=0;i--){

            rightMax[i]=Math.max(rightMax[i+1],heights[i]);
        }

        return rightMax;
    }
}
