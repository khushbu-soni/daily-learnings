package org.example;

import java.util.Arrays;


/*
* Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.
* */
public class SortColors {

    public static void main(String[] args) {

        int num[]={1,1,1,0,0,2,2,0};
        sort(num);
        for (int i : num) {
            System.out.print(i+" ,");

        }
    }

     public static  void sort(int[] nums){

            int i=0;
            int j=0;
            int k=nums.length-1;

            while (j<=k){


                if(nums[j]==1){
                    j++;
                } else if (nums[j]==2) {
                    swap(nums,j,k);
                    k--;
                }else{
                    swap(nums,j,i);
                    i++;
                    j++;

                }
            }
     }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
