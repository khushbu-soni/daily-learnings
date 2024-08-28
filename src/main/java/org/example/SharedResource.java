package org.example;

public class SharedResource {

    boolean itemAvailable =false;

    public synchronized void addItem(){
        itemAvailable=true;
        System.out.println("Item added by "+ Thread.currentThread().getName()+" and Invoiking notifyAll");
        notifyAll();
    }

    public synchronized void consumeItem(){
        System.out.println("Conusmed method Invoke by :"+Thread.currentThread().getName());
        while (!itemAvailable){
            try{
                System.out.println(" Thread "+Thread.currentThread().getName()+" is waiting ");
                wait(); //It will release the monitor locak
            }catch (Exception e){

            }
        }

        System.out.println("Item Consumend by "+ Thread.currentThread().getName());

        itemAvailable=true;
    }
}
