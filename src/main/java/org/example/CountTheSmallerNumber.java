package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*
 * Leetcode 315 Count of Smaller Numbers After Self (Java)
 * */
public class CountTheSmallerNumber {

    public static void main(String[] args) {
        int[] nums={5,2,6,1};
        List<Integer> resList = countTheSmallerNumber(nums);

        for (Integer i : resList) {
            System.out.println("+++++ values"+i);
        }
    }
    public static List<Integer> countTheSmallerNumber(int[] nums){

        List<Integer> resultList=new LinkedList<>();
        LinkedList<Integer> sortedList=new LinkedList<>();

        for( int i=nums.length-1;i>=0;i--){
            int index = insertViaMergeSort(sortedList, nums[i]);
            resultList.add(0,index);
        }

        return resultList;

    }

    public static int insertViaMergeSort(LinkedList<Integer> sortedList,int num){

        int low =0;
        int high=sortedList.size()-1;

        if(sortedList.isEmpty() || num<sortedList.get(0)){

            sortedList.addFirst(num);
            return 0;
        }

        if(num>sortedList.get(high)){

            sortedList.addLast(num);
            return high+1;
        }

        while ( (high-low) >1){

            int mid=(low + high) /2;

            if(num<=sortedList.get(mid)){
                high=mid;
            }else{
                low=mid;
            }
        }


        if(num<= sortedList.get(low)){
            sortedList.add(low,num);
            return low;
        } else if (num> sortedList.get(high)) {
            sortedList.add(high+1,num);
            return high+1;
        }else{
            sortedList.add(high,num);
            return high;
        }


    }
}
