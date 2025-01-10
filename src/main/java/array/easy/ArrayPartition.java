package array.easy;

import java.util.Arrays;

public class ArrayPartition {
/*
* The algorithm is first sort the input array and then the sum of 1st, 3rd, 5th..., is the answer.
* */
    public static void main(String[] args) {

        int[] nums={1,4,3,2};
        int maximumSum = getMaximumSum(nums);
        System.out.println(maximumSum);
    }

    public static int getMaximumSum(int[] nums){
        int maxSum=0;
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i+=2){
            maxSum+=nums[i];
        }

        return maxSum;
    }
}
