package array.easy;

public class MaxSubArray {
    public static void main(String[] args) {
        int [] nums={-2,1,-3,4,-1,2,1,-5,4};

        int i = maxSubArrayUsingKadane(nums, nums.length);
        System.out.println(i);
    }

    public static int maxSubArrayBruteForce(int[] arr , int n ){

        int max=Integer.MIN_VALUE;

        for (int i = 0; i <arr.length; i++) {
            for (int j = i; j <arr.length ; j++) {
                int sum=0;

                for (int k = i; k <=j ; k++) {
                    sum+=arr[k];
                }

                max=Math.max(max,sum);

            }
        }
        return max;
    }

    public static int maxSubArrayUsingKadane(int[] arr , int n ){

        int maxEndingHere=arr[0];
        int maxSoFar=arr[0];

        for (int j : arr) {

            maxEndingHere = Integer.max(j, maxEndingHere + j);
            maxSoFar = Integer.max(maxSoFar, maxEndingHere);

        }
        return maxSoFar;
    }
}
