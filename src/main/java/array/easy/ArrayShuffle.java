package array.easy;

import java.util.Arrays;

public class ArrayShuffle {

    public static void main(String[] args) {

        int[] nums={2,5,1,3,4,7};
        int n=3;

        int[] shuffle = shuffle(nums, n);

        System.out.println(Arrays.toString(shuffle));
    }

    public static int[] shuffle(int[] nums,int n){

        int[] numArray=new int [2*n];
        int firstPointer=0;
        int secondPointer=n;

        for (int i=0;i<n;i++){

            numArray[firstPointer]=nums[i];
            numArray[firstPointer+1]=nums[secondPointer];
            secondPointer++;
            firstPointer+=2;

        }

        return numArray;
    }
}
