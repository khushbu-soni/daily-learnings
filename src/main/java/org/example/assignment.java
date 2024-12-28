package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* Given an array “arr” of size n, find the next greater element for every element of the array.
The next greater element for element x in the array is the first greater element to its right. If no such element exists, output -1 for that position.

Input:
The first line contains an integer n, the size of the array.
The second line contains space-separated integers, the elements of the array.
i/p:
1. 	6
4 5 2 25 7 8
*
*

2.	5
1 2 3 4 5

3.	5
5 4 3 2 1
Output:
Print a single line with n space-separated integers representing the next greater elements for each position.
o/p:
	1.	5 25 25 -1 8 –1

	2. 	2 3 4 5 -1

	3. 	-1 -1 -1 -1 -1
* */
public class assignment {


    public static void main(String[] args) {

        int[] num={4,5,2,25,7,8};
        List<Integer> nextGreaterElement = findNextGreaterElement(num);

        for (Integer i : nextGreaterElement) {
            System.out.println(i+" ");
        }
    }


    /*
    * 5
6
-1
6
-1
-1
    * */
    public  static List<Integer> findNextGreaterElement(int[] nums){
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
//4 5 2 25 7 8
            if(i==nums.length-1)
                list.add(-1);

            for(int j=i+1;j<nums.length;j++) {

                if (nums[i] < nums[j]) {
                    list.add(nums[j]);
                    break;
                } else {
                    list.add(-1);
                }


            }
        }

        return list;

    }


    public  static List<Integer> findNextGreaterElementOPT(int[] nums){
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
//4 5 2 25 7 8
            if(i==nums.length-1)
                list.add(-1);

            for(int j=i+1;j<nums.length;j++) {

                if (nums[i] < nums[j]) {
                    list.add(nums[j]);
                    break;
                } else {
                    list.add(-1);
                }


            }
        }

        return list;

    }
}
