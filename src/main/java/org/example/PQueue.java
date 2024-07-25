package org.example;

import java.util.PriorityQueue;

public class PQueue {

    public static void main(String[] args) {

        PriorityQueue <Integer> pq=new PriorityQueue<>(((Integer a, Integer b)->b-a));
        pq.add(3);
        pq.add(2);
        pq.add(8);
        pq.add(1);
        pq.add(6);

//        pq.forEach((Integer i)->System.out.println(i));
        pq.forEach(System.out::println);

        while (!pq.isEmpty()){
            int val =pq.poll();

        }
        
    }  


}
