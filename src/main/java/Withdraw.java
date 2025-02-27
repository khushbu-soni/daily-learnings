public class Withdraw implements Runnable{

    @Override
    public void run() {
        System.out.println(" Withdraw thread Started");
    }

    public synchronized int withdraAmount(int amount){

        return amount;
    }
}
