package stack.medium;

import java.util.HashMap;
import java.util.Map;

public class MaximumLengthOfString {

    public static void main(String[] args) {

        String str="abaacbcbb";
        System.out.println(minimumLength(str));
    }

    public static int minimumLength(String str){

        int[] cArray=new int[26];
        int length=0;
        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            cArray[c-'a']++;

        }

        for (int i : cArray) {

            if (i==0) continue;;

            length+=(i%2==0)?2:1;
        }

        return length;
    }
}
