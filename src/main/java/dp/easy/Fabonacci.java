package dp.easy;

public class Fabonacci {

    public static void main(String[] args) {
        int fib = fib(5);

        System.out.println(fib);
    }

    public static int fib(int n){
        if(n<=1) return n;

        return fib(n-1)+fib(n-2);
    }
}
