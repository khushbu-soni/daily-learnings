package array.medium;

public class NeighboringBitwiseXOR {

    public static void main(String[] args) {

        int[] derived={1};
        System.out.println(doesValidArrayExistOPT(derived));
    }

    public  static boolean doesValidArrayExist(int[] derived){

        int[] orignalArray=new int[derived.length];

        orignalArray[0]=0;
        for (int i = 0; i <derived.length-1 ; i++) {

            orignalArray[i+1]=orignalArray[i]^derived[i];

        }

        if((orignalArray[derived.length-1]^orignalArray[0])==derived[derived.length-1]){
            return true;
        }

        orignalArray[0]=1;
        for (int i = 0; i <derived.length-1 ; i++) {

            orignalArray[i+1]=orignalArray[i]^derived[i];


        }

        if((orignalArray[derived.length-1]^orignalArray[0])==derived[derived.length-1]){
            return true;
        }

        return false;
    }

    public  static boolean doesValidArrayExistOPT(int[] derived){
        int xor=0;
        for (int i = 0; i < derived.length; i++) {
            xor^=derived[i];

        }
        return xor == 0;
    }

}
