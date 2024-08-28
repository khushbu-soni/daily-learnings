package org.example;

public class Sresource {
boolean isAvailable =true;

    public synchronized void produce(){
        System.out.println("Lock Accuired");

        isAvailable=true;

        try{
            Thread.sleep(8000);

        }catch (Exception e){

        }

        System.out.println("Lock Release");
    }
}
