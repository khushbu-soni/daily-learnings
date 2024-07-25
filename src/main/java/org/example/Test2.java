package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Test2 {

    public static void main(String[] args) {

//        List<Employee> emp=new ArrayList<Employee>();
//        AtomicInteger amountSum= new AtomicInteger();
//        List<Employee> collect = emp.stream().filter(dep -> dep.getDepartment().equals("IT")).collect(Collectors.toList());
        Random random=new Random();
        Predicate<Integer> isEvenNumber=(i)->i%2==0;
        Supplier<Integer> rendomNumber=()->random.nextInt(100);

        String str="HelloWorl";
        Integer val = rendomNumber.get();

        if(isEvenNumber.test(str.length()))
            System.out.println("Even Number");

            System.out.println("Odd Number");
            System.out.println("val"+val);


    }


}
