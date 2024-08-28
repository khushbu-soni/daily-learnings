package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Techumn {

    public static void main(String[] args) {
//
//        FIND ALL MISSING POSITIVE NUMBERS IN THE ARRAY IN BTW MIN AND MAX NUMBER
//        Input: nums = [3,6,-1,1]
//        Output: 2,4,5

        int [] num={ 3,6,-1,1};
        List<Integer> array = Arrays.stream(num).filter(n -> n > 0).boxed().collect(Collectors.toList());

        List<Integer> allMissing = findAllMissing(array);
//        allMissing.stream().forEach();

        for (Integer i : allMissing) {
            System.out.println(i);
        }
    }

    public static List<Integer> findAllMissing( List<Integer> num){
        List<Integer> collect = num.stream().sorted().collect(Collectors.toList());
        List<Integer> list=new ArrayList<>();
        int min=collect.stream().findFirst().get();
        int max=collect.get(collect.size()-1);

        for (int i=min+1;i<max;i++){

//            System.out.println(i);
            if(!collect.contains(i))
                list.add(i);
        }
        return list;
    }
}
