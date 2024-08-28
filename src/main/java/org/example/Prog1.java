package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class Prog1 {

    public static void main(String[] args) {
//
//        Example:
//        Input: [2, 7, 11, 15], target = 9
//        Output: [2, 7]
        int [] num={2,7,11,15};
        int target=9;
        int[] sumOfTwo = findSumOfTwo(num, target);

        Arrays.stream(sumOfTwo).forEach(System.out::println);
    }

    private static int[] findSumOfTwo(int[] num, int target) {

        HashMap<Integer,Integer> numToindex=new HashMap<Integer,Integer>();

        for (int i=0;i<num.length;i++) {



            if(numToindex.containsKey(num[i]))
                return new int[]{numToindex.get(num[i]),i};
            else
                numToindex.put(target-num[i],i);
        }

        return new int[0];
    }
}
