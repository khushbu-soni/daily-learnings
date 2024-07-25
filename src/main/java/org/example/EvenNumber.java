package org.example;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,5,2,5,6,7,8);
        list.stream().filter(n->n%2==0).forEach(System.out::println);

        list.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
    }
}
