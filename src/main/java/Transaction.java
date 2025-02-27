

public class Transaction {

    public static void main(String[] args) {

        Runnable deposit=new Depositor(10);
//
        Thread depositThred=new Thread(deposit);
//
//        Runnable witdra=new Withdraw();
//
//        Thread with=new Thread(witdra);
        depositThred.start();






    }
}
