package org.example;

public class PalindromNumber {

    public static void main(String[] args) {
        boolean palindrom = isPalindrom(636);
        System.out.println(palindrom);
    }

    public static boolean isPalindrom(int num){
        boolean isPalindrom=false;

        int rev=0; int temp=num;

        while (temp!=0){

            int lastDigit=temp % 10;
            rev=rev*10+lastDigit;
            temp=temp/10;

        }

        if(rev==num) isPalindrom=true;

        return isPalindrom;
    }
}
