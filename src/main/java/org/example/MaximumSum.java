package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class MaximumSum {

    public static void main(String[] args) {

        int[][] nums= new int[][]{{1,2,3},{-1,-2,-3},{1,2,3}};
        ;
        System.out.println(findSum(nums));
    }

    public static  long findSum(int[][] nums) {
        long sum = 0;
        int nagetiveCount = 0;
        int smallestNumber = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                int num = nums[i][j];
                if (num < 0)
                    nagetiveCount++;

                sum += Math.abs(num);

                smallestNumber=Math.min(smallestNumber,Math.abs(num));
            }


        }


        if (nagetiveCount % 2 == 0) {

            return sum ;

        }
        return sum- 2*smallestNumber;
    }

    private static int findSmallestNumber(int[][] nums) {

      return   Arrays.stream(nums).flatMapToInt(Arrays::stream).boxed().collect(Collectors.toList()).get(0);
    }
}
