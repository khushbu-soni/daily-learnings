import java.util.concurrent.atomic.AtomicInteger;

public class Depositor implements Runnable{
    int balanceAmount=100;
    int amount=0;

    public Depositor(int balanceAmount) {
        this.amount = balanceAmount;
    }

    @Override
    public void run() {
        balanceAmount+=this.amount;
        System.out.println("Amount  has been added to account Balance Amount is "+balanceAmount);
        System.out.println(" Depositor thread started....");
    }

}
