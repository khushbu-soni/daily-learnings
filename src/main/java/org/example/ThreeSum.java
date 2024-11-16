package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {

        ThreeSum test=new ThreeSum();

        int[] num={-1,0,1,2,-1,-4};
        List<List<Integer>> lists = test.threeSum(num);
        System.out.println("Test");
        lists.forEach(System.out::println);

    }
    List<List<Integer>> listOfList= new ArrayList<>();

    public List<List<Integer>> threeSum(int[] num){

        if(num.length<3)
            return listOfList;
        listOfList.clear();

        Arrays.sort(num);

        for(int i=0;i<num.length;i++){

            if(i>0 && num[i]==num[i-1])
                continue;
            int n1=num[i];
            int target=-n1;
            
            twoSum( num,  target, i+1,num.length-1);


        }

        return listOfList;
    }

    private void twoSum(int[] num, Integer target, int start, int end) {

        while (start<end){

            if(num[start]+num[end]>target) {
                end--;
            }else if (num[start]+num[end] <target) {
                start++;
            }else{

                while (num[start]==num[start+1]) start++;
                while (num[end]==num[end-1]) end--;

                List<Integer> list=new ArrayList<>();

                list.add(-target);
                list.add(num[start]);
                list.add(num[end]);

                listOfList.add(list);
                start++;
                end--;
            }
        }
    }
}
