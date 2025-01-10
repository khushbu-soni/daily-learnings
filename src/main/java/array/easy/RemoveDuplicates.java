package array.easy;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums={1,1,2};
        int i = removeDup(nums);
        System.out.println(i+"hkjh");
    }

    public static int removeDup(int [] nums){

        int count=0;
        int n =nums.length;
        int firstPointer=0;
        int secondPointer=1;

        while (secondPointer<n){

            if(nums[firstPointer]!=nums[secondPointer]){
                firstPointer++;
                nums[firstPointer]=nums[secondPointer];

            }
            secondPointer++;
        }

        return firstPointer+1;
    }
}
