package array.easy;

import java.util.Arrays;

public class LargestNumberArray {
    public static void main(String[] args) {
        int[] nums={2,5,1,3,0};
        System.out.println(findLargestNUmberBetterApproch(nums));
    }

    public static int findLargestNUmber(int[] nums){
        int largestNumber=0;

        Arrays.sort(nums);

        largestNumber=nums[nums.length-1];
        System.out.println("Largest NUmber+ "+ nums[nums.length-1]);
        return largestNumber;

    }

    public static int findLargestNUmberBetterApproch(int[] nums){
        int largestNumber=Integer.MIN_VALUE;

        for (int i = 0; i <nums.length ; i++) {
           largestNumber=Math.max(nums[i],largestNumber);
        }

        return largestNumber;
    }
}
