package string.medium;

import java.util.HashMap;
import java.util.Map;

public class KpalindromString {

    public static void main(String[] args) {
        String str="messi";
        int k=3;
        boolean palindrom = isPalindrom(str, k);

        System.out.println(palindrom);
    }

    public static boolean isPalindrom(String str,int k){

        if(str.length()==k)
            return true;
        if (str.length() < k )
            return false;

        char[] charArray = str.toCharArray();

        HashMap<Character,Integer> mapFreq= new HashMap();

        for (char c : charArray) {

            mapFreq.put(c,mapFreq.getOrDefault(c,0)+1);
        }
        int count=0;
        for(Map.Entry<Character,Integer> entry:mapFreq.entrySet() ){
            if(entry.getValue()%2!=0)
                count++;
        }

//        long count=0;
//         count = mapFreq.entrySet().stream().filter(entry -> entry.getValue() % 2 != 0).count()+1;


        return count <= k;

    }
}
