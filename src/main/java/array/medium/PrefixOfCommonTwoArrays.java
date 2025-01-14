package array.medium;

import java.util.Arrays;

public class PrefixOfCommonTwoArrays {

    public static void main(String[] args) {
        int[] A={1,3,2,4};
        int[] B={3,1,2,4};

        int[] thrPrefix = findThrPrefix(A, B);
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
}
