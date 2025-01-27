package array.medium;

import java.util.Arrays;

public class LexicographicallySmallestArray {

    public static void main(String[] args) {

        int[] nums={1,5,3,9,8};
        int[] nums1 = lexicographicallySmallestArray(nums, 2);
        System.out.println(Arrays.toString(nums1));
    }

    public static int[] lexicographicallySmallestArray(int[] nums,int limit){

        int n=nums.length;

        for (int i = 0; i <n ; i++) {
            int minIndex=i;
            for (int j = i+1; j <n ; j++) {

                if(Math.abs(nums[i]-nums[j])<=limit && nums[j]<nums[minIndex]){
                    minIndex=j;
                }

            }


            if(minIndex!=i){

                int temp=nums[i];
                nums[i]=nums[minIndex];
                nums[minIndex]=temp;
            }
        }

        return nums;
    }
}
