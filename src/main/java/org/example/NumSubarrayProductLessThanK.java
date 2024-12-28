package org.example;

public class NumSubarrayProductLessThanK {

    public static void main(String[] args) {
        int[] nums={10,5};
        int target=100;
        int usingBruteForce = find(nums, target);
        System.out.println(usingBruteForce);
    }

    public  static int  findUsingBruteForce(int[] nums, int target){
//
        int count=0;

        for(int i=0;i<nums.length;i++){
            int product =1;
            for(int j=i;j<nums.length;j++){
                product*=nums[j];

                if (product<target){
                    count++;
                }else {
                    break;
                }
            }
        }

        return count;
    }

    public  static int  find(int[] nums, int target){

        int count=0;
        int product=1;

        int i=0;

        if(target<=1){
            return 0;
        }
        for (int j=0;j<nums.length;j++){

            product*=nums[j];

            while (product>=target){
                product/=nums[i];
                i++;
            }

            count+=(j-i+1); // gives number of subarrays ending at j

        }

        return count;
    }
}
