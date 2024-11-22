package org.example;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] nums={1,2,3,4};
//        int[] ints = withDivMethod(nums);
//        int[] ints = withoutDiv(nums);
        int[] ints = withoutDivConsTime(nums);
        for (int anInt : ints) {

            System.out.println(anInt);
        }
    }


    public static int[] withoutDiv(int[] nums){

        int n =nums.length;

        int[] left=new int[n];
        int[] right=new int[n];

        left[0]=1;
        right[n-1]=1;
        for (int i=1; i<n;i++){
            left[i]=nums[i-1]*left[i-1];
        }

        for (int i=n-2; i>=0;i--){
            right[i]=nums[i+1]*right[i+1];
        }

        int[] res=new int[n];

        for (int i=0; i<n;i++){
            res[i]=left[i]*right[i];
        }
        return res;
    }
    public static int[] withDivMethod(int[] nums ){

        int n=nums.length;

        int countZero=0;
        int countWithoutZero=1;

        for (int num : nums) {

            if(num==0){
                countZero++;
            }else{
                countWithoutZero*=num;
            }
        }

        int[] res=new int[n];

        for(int i =0;i<n;i++){
            int num=nums[i];

            if(num!=0){
                if(countZero>0)
                    res[i]=0;
                else
                    res[i]= (int) ((double) countWithoutZero /nums[i]);
            }else{
                if(countZero>1)
                    res[i]=0;
                else
                    res[i]= (int) ((double) countWithoutZero /nums[i]);
            }

        }

        return res;
    }

    public static int[] withoutDivConsTime(int[] nums){

        int n =nums.length;

        int[] res=new int[n];


        res[0]=1;

        for (int i=1; i<n;i++){
            res[i]=nums[i-1]*res[i-1];
        }

        int rightProduct=1;

        for (int i=n-1; i>=0;i--){
            res[i]=res[i]*rightProduct;
            rightProduct*=nums[i];
        }
        return res;
    }

}
