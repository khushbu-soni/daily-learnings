package array.easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums={3,4,9,2}; int target=6;

        int[] ints = twoSumOptimized(nums, target);

        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSumBruteForce(int[] nums,int target){


        for(int i =0;i<nums.length;i++){
            int remainingNumber=target-nums[i];

            for(int j=1;j<nums.length;j++){

                if(remainingNumber==nums[j]){
                    return new int[]{i,j};
                }

            }
        }

        return new int[]{0};
    }


    public static int[] twoSumOptimized(int[] nums,int target){

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){

            int remainingNumber=target-nums[i];

            if (map.containsKey(remainingNumber)) {

                return new int[]{map.get(remainingNumber),i};
            }

            map.put(nums[i],i);

        }

        return new int[]{0};
    }
}
