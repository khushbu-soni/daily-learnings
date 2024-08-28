package org.example;

public class DeadLocakExample {

    public static void main(String[] args) {
        Sresource sresource=new Sresource();
        Thread t1=new Thread(()->{
            System.out.println("Thread1 calling produce method");
           sresource.produce();

        });

       Thread t2 =new Thread(()->{
           try{
               Thread.sleep(1000);

           }catch (Exception e){

           }
           System.out.println("Thread2 calling produce method");
           sresource.produce();
       }) ;

       t1.start();
       t2.start();

       try{
            Thread.sleep(3000);
       }catch (Exception e){

       }
        t1.resume();
       System.out.println("Maina thread finishing it's work");


    }
}
