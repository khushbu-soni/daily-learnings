package org.example;

public class FindTheSecondLargestNumber {

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int i = secondLargest(nums);
        System.out.println(i);
    }

    public static int secondLargest(int[] nums){
        int secondLargest=Integer.MIN_VALUE;
        int largest=Integer.MIN_VALUE;

        for(int i=0;i < nums.length;i++){

            if(nums[i] >= largest){
                secondLargest=largest;
                largest=nums[i];

            }else {
                secondLargest=nums[i];
            }

        }
        return secondLargest;
    }
}
