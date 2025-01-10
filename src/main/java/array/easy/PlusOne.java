package array.easy;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] nums={8,8,9};
        int[] ints = pluseOne(nums);

        System.out.println(Arrays.toString(ints));
    }

    public static int[] pluseOne(int[] nums){

        for(int i=nums.length-1;i>=0;i--){

            if(nums[i]==9){
                nums[i]=0;
            }else{
                nums[i]++;
                return nums;
            }
        }
        nums=new int[nums.length+1];
        nums[0]=1;
        return nums;
    }
}
