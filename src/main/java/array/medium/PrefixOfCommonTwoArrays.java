package array.medium;

import java.util.Arrays;
import java.util.HashMap;

public class PrefixOfCommonTwoArrays {

    public static void main(String[] args) {
        int[] A={1,3,2,4};
        int[] B={3,1,2,4};

        int[] thrPrefix = findThrPrefixON(A, B);
        System.out.println(Arrays.toString(thrPrefix));

    }

    public static int[] findThrPrefix(int[] A, int[] B){

        int[] result=new int[A.length];

        for(int i=0;i<A.length;i++){
            int count=0;
            for(int aI=0;aI<=i;aI++){
                for (int bI=0;bI<=i;bI++){
                    if(B[bI]==A[aI]){
                        count++;
                        break;
                    }

                }

            }

            result[i]=count;

        }

        return result;
    }

    public static int[] findThrPrefixON2(int[] A, int[] B){

        int[] result=new int[A.length];


        boolean[] isPresentA=new boolean[A.length+1];
        boolean[] isPresentB=new boolean[B.length+1];

        for(int i=0;i<A.length;i++){
            int count=0;
           isPresentA[i]=true;
           isPresentB[i]=true;

           for (int j=1;j<=A.length;j++){

               if(isPresentA[j] && isPresentB[j]){
                   count++;
               }
           }
            result[i]=count;

        }

        return result;
    }

    public static int[] findThrPrefixON(int[] A, int[] B){

        int[] result=new int[A.length];

        HashMap<Integer,Integer> freqMap=new HashMap<>();

        int count=0;
        for(int i=0;i<A.length;i++){

            freqMap.put(A[i],freqMap.getOrDefault(A[i],0)+1);
            if(freqMap.get(A[i])==2)
                count++;

            freqMap.put(B[i],freqMap.getOrDefault(B[i],0)+1);
            if(freqMap.get(B[i])==2)
                count++;
        result[i]=count;
        }

        return result;
    }
}
