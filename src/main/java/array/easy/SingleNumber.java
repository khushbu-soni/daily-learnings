package array.easy;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums={4,4,1,2,1,2,6};
        int singleNumber = findSingleNumberXOR(nums);
        System.out.println(singleNumber);
    }

    public static int findSingleNumber(int[] nums){
        if(nums.length%2==0) return 0;
        HashMap<Integer,Integer> freqMap=new HashMap<>();
        for (int num : nums) {
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }


        return freqMap.entrySet().stream().filter(entry->entry.getValue()==1).map(Map.Entry::getKey).findFirst().get();
    }

    public static int findSingleNumberXOR(int[] nums){
        if(nums.length%2==0) return 0;
        int result=0;

        for (int i = 0; i <nums.length ; i++) {
            result^=nums[i];
        }


        return result;
    }
}
