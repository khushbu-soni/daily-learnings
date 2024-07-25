package org.example;

import java.awt.*;

public class MonitorLockExample {

    public synchronized void task1(){
        try{
            System.out.println("Inside task1");
            Thread.sleep(1000);
        }catch (Exception e){

        }
    }

    public void task2(){
        System.out.println("task2, but before syncronized");
        synchronized (this){
            System.out.println("task2 , inside syncronized block");
        }
    }

    public void task3(){
        System.out.println("task3");

    }
}
