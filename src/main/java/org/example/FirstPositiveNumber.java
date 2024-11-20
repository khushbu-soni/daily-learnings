package org.example;

import static java.lang.Math.abs;

public class FirstPositiveNumber {

    public static void main(String[] args) {
        int[] nums={3,4,-1,1};
        int firstPositiveNumberIndex = findFirstPositiveNumberIndex(nums);
        System.out.println("firstPositiveNumberIndex "+firstPositiveNumberIndex);
    }


    /*
     * step 1. check if array contains 1 if yes than mark the containsFlag as true;
     * step 2 : check if number is negative or grater than n then mark the number as 1
     * step 3 : if contains1Flag is false than return firstPositive number as 1;
     * step 4 : mark all number as negative number by checking the index if num[i] value is already negative than ignore;
     * step 5 : check if there is any non negative number exists
     *       if existes than return the +1 index of the num
     *       else
     *       return n+1 as firstPositiveNumber
     * */

    public static int findFirstPositiveNumberIndex(int[] nums){

        int n=nums.length;
        boolean contains1=false;
        for(int i =0; i<n;i++){
            if(nums[i]==1) contains1=true;
        
            if(nums[i] <= 0 || nums[i]>n) nums[i]=1;
        }
        if(contains1==false)
            return 1;
        
        for(int i =0;i<n;i++){
            int num= abs(nums[i]);
            int idx=num-1;

            if(nums[idx]<0) continue;
            nums[idx]*=-1;
        }

        for(int i=0;i<n;i++){
            if(nums[i]>0)
                return i+1;
        }
        return n+1;
    }
}

