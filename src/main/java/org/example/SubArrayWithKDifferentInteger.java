package org.example;

import java.util.HashMap;

public class SubArrayWithKDifferentInteger {

    public static void main(String[] args) {
        int k=2; int[] nums={1,2,1,2,3};
        int i = atMostKDistinct(nums, k) - atMostKDistinct(nums, k - 1);
        System.out.println(i);

    }

    public static int atMostKDistinct(int[] nums,int k){

        HashMap< Integer,Integer> freqMap=new HashMap<>();

        int count=0;
        int windowStart=0;

        for (int windowEnd=0;windowEnd<nums.length;windowEnd++){
            int num=nums[windowEnd];

            freqMap.put(num,freqMap.getOrDefault(num,0)+1);


            while (freqMap.size()>k){
                int statNUm=nums[windowStart];
                freqMap.put(statNUm,freqMap.get(statNUm)-1);
                if(freqMap.get(statNUm)==0){
                    freqMap.remove(statNUm);
                }
                windowStart++;

            }
            count += windowEnd - windowStart + 1;
        }

        return count;

    }
}
