package array.easy;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
    int[] nums={0,1};
        int i = missingNumberWithBST(nums);
        System.out.println(i);

    }

    public static  int missingNumber(int[] nums){

        int n=nums.length;
        int sum=n*(n+1)/2;

        for (int i = 0; i <n; i++) {

                sum-=nums[i];

        }
        return sum;
    }
    public static  int missingNumberWithXOR(int[] nums){

        int n=nums.length;
        int result=n;
        for (int i = 0; i <n; i++) {

            result^=i;
            result^=nums[i];

        }
        return result;
    }

    public static  int missingNumberWithBST(int[] nums){

        int n=nums.length;
        int result=n;

        Arrays.sort(nums);
        int l=0;int r=n-1;
        while (l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]>mid){
                result=mid;
                r=mid-1;

            }else{
                l=mid+1;
            }
        }

        return result;
    }
}
