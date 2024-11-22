package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrimeNumberUsingSeive {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 15, 3, 7, 19, 23, 33, 42);

        // Find prime numbers
        List<Integer> primes = findPrimesInList(numbers);

        // Output the result
        System.out.println("Prime numbers in the list: " + primes);

    }
    public static List<Integer> findPrimesInList(List<Integer> numbers) {
        // Step 1: Find the maximum number in the list
        int max = Collections.max(numbers);

        // Step 2: Generate the sieve
        boolean[] isPrime = sieveOfEratosthenes(max);

        // Step 3: Filter primes from the list
        List<Integer> primes = new ArrayList<>();
        for (int num : numbers) {
            if (num > 1 && isPrime[num]) {
                primes.add(num);
            }
        }
        return primes;
    }

    /*
    * What does Seive methaod says.
    * take an empty array of max+1 size
    *fill all the values as true except 0, 1 index mark them false
    * loop from i=2 tp i*i<n and chcek if num is true , than mark all the multilper of that number as false
    * */
    public static boolean[] sieveOfEratosthenes(int n){
    boolean[] isPrime=new boolean[n+1];

        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;

        for(int i =2;i*i<n;i++){
            if(isPrime[i]){
                for(int j=i*i; j<=n;j+=i){
                    isPrime[j]=false;
                }
            }
        }
    return isPrime;
    }
}
