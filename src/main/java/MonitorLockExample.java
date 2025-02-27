public class MonitorLockExample {

    public synchronized void task1(){
        try{

            System.out.println("Inside task1");
            Thread.sleep(10000);
            System.out.println("Task 1 completed ");
        }catch (Exception e){


        }
    }

    public void task2(){
        System.out.println("Task 2 but before syncronized");

        synchronized (this){
            System.out.println("task 2 after syncronized");
        }
    }

    public void task3(){
        System.out.println("task3");
    }


}
