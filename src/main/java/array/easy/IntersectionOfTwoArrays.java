package array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] num1={4,9,5};
        int[] num2={9,4,9,8,4};

        int[] intersect = intersect(num1, num2);
        System.out.println(Arrays.toString(intersect));
    }

    public static int[] intersect(int[] num1,int[] num2){

        ArrayList<Integer> list = new ArrayList<>();

        HashMap<Integer,Integer> freqMap=new HashMap<>();
        for (int i : num1) {
            freqMap.put(i,freqMap.getOrDefault(i,0)+1);
        }

        for (int num : num2) {
            int freq = freqMap.getOrDefault(num,0);
            if (freq > 0) {
                list.add(num);
                freqMap.put(num, freqMap.get(num) - 1);
            }
        }

        int[] result=new int[list.size()];
        result=list.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}
