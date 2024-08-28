package org.example;

public class ItemProcesor {


    public static void main(String[] args) {
        SharedResource sharedResourceObj=new SharedResource();
        Thread producerThread=new Thread(()->{

            try{
                Thread.sleep(2000);
            }catch (Exception e){

            }
            sharedResourceObj.addItem();

        });

       Thread consumerThread=new Thread(()->{

          sharedResourceObj.consumeItem();
       });
        producerThread.start();
        consumerThread.start();
    }

}
