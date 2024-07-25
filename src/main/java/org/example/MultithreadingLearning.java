package org.example;

public class MultithreadingLearning implements Runnable{


    public void run(){

        System.out.println("Code executed by thread "+ Thread.currentThread().getName());
    }



}
