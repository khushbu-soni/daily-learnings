package array.easy;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(roteRightWithKTemp(nums,2)));
    }

    public static int[] roteOnePositionWithTempArray(int[] nums,int k){
        int[] temp=new int[nums.length];

        for(int i=k;i<nums.length;i++){

            temp[i-1]=nums[i];

        }
        temp[nums.length-1]=nums[0];
        return temp;
    }

    public static int[] roteOnePositionOpt(int[] nums,int k){
        int temp=nums[0];

        for(int i=0;i<nums.length-1;i++){

            nums[i]=nums[i+1];

        }
        nums[nums.length-1]=temp;
        return nums;
    }

    public static int[] roteRightWithKTemp(int[] nums,int k){
        int n=nums.length;

        int[] result = new int[n];

        for (int i = 0; i <n ; i++) {
         int RRI=(i+k)%n;
         result[RRI]=nums[i];
        }

        return result;
    }
}
