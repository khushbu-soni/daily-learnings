package array.medium;

import java.util.HashMap;
import java.util.Map;

public class BiwiseXor {


    public static void main(String[] args) {

        int[] num1={2,1,3}; int[] num2={10,2,5,0};
        int i = findAllXor(num1, num2);
        System.out.println(i);
    }

    public static int xorAllNUms(int[] num1,int[] num2){

        int result=0;
        HashMap<Integer,Integer> freqMap=new HashMap<>();

        for (int i = 0; i <num1.length ; i++) {
            freqMap.put(num1[i],freqMap.getOrDefault(num1[i],0)+num2.length);
        }

        for (int i = 0; i <num2.length ; i++) {
            freqMap.put(num2[i],freqMap.getOrDefault(num2[i],0)+num1.length);
        }

        for(int num: freqMap.keySet()){
            if(freqMap.get(num)%2!=0){
                result^=num;
            }

        }
        return result;
    }


    public  static int  findAllXor(int nums1[], int nums2[]) {

        int m = nums1.length;
        int n = nums2.length;

        int result = 0;
        if (m % 2 != 0) {
            for (int j : nums2) {
                result ^= j;
            }
        }

            if (n % 2 != 0) {
                for (int i : nums1) {
                    result ^= i;
                }
            }



        return result;
    }

}
