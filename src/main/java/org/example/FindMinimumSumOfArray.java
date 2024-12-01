package org.example;

import java.util.Stack;

public class FindMinimumSumOfArray {

    public static void main(String[] args) {

        int[] nums={3,1,2,4};
        long sum = findSumOptimized(nums);
        System.out.println("Sum "+sum);

    }

    public  static int findSum(int[] nums){
        int sum=0;
        
        for(int i=0;i<nums.length;i++){

            for(int j=i; j<nums.length;j++){
                int min=Integer.MAX_VALUE;
                for(int k=i;k<=j;k++){
                    min=Math.min(min,nums[k]);
                }

                sum+=min;
            }
        }
            

        return sum;
    }

    public static long findSumOptimized(int[] nums){
        int size=nums.length;
        long[] nsl=getNSL(nums,size);
        long[] nsr=getNSR(nums,size);
        long sum=0;

        for(int i=0;i<size;i++){
            long leftValue=i-nsl[i];
            long rightValue=nsr[i]-i;

            long totalWays=leftValue*rightValue;

            long totalSum=nums[i]*totalWays;

            sum= (int) (sum+ totalSum);
        }

        return sum;
    }

    private static long[] getNSR(int[] nums, int size) {

        long[] result=new long[size];
        Stack<Integer> st=new Stack<>();
        for(int i =size-1;i>=0;i--){

            if(st.empty())
                result[i]=size;
            else{
                while (!st.empty() && nums[st.peek()] > nums[i])
                    st.pop();

                result[i]=st.empty() ? size :st.peek();

            }

            st.push(i);

        }

        return result;
    }

    private static long[] getNSL(int[] nums, int size) {

        long[] result= new long[size];

        Stack<Integer> st=new Stack();

        for(int i =0 ;i<size;i++){

            if(st.empty())
                result[i] = -1;
            else{
                int peek=st.peek();
                while (!st.isEmpty() && nums[st.peek()] >= nums[i])
                    st.pop();

                result[i]=st.empty() ? -1:st.peek();


            }
            st.push(i);

        }

        return result;
    }

        public int sumSubarrayMins(int[] arr) {


            int n = arr.length;
            long mod = 1_000_000_007;

            Stack<Integer> stack = new Stack<>();
            long[] prevLess = new long[n];
            long[] nextLess = new long[n];

            // Calculate Previous Less Element (PLE)
            for (int i = 0; i < n; i++) {
                while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                    stack.pop();
                }
                prevLess[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
                stack.push(i);
            }

            // Clear the stack for reuse
            stack.clear();

            // Calculate Next Less Element (NLE)
            for (int i = n - 1; i >= 0; i--) {
                while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                    stack.pop();
                }
                nextLess[i] = stack.isEmpty() ? n - i : stack.peek() - i;
                stack.push(i);
            }

            // Calculate the sum of subarray minimums
            long result = 0;
            for (int i = 0; i < n; i++) {
                result = (result + arr[i] * prevLess[i] * nextLess[i]) % mod;
            }

            return (int) result;
        }
    }

