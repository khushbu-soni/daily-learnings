package org.example;

import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] nums = new int[]{1,-2,-5,3};
        String[] word1={"ab","c"};
        String[] word2={"a","bc"};

//        System.out.println(Arrays.toString(twoSum(nums, 7)));
//        System.out.println(Arrays.toString(new int[]{maxProfit(nums)}));
//        System.out.println(Arrays.toString(new int[]{maxSubArray(nums)}));
//        System.out.println(arrayStringsAreEqual(word1,word2));

        MultithreadingLearning learning=new MultithreadingLearning();

        Thread t=new Thread(learning);
        t.start();
        System.out.println("Fininsh main method "+ Thread.currentThread().getName());


        MonitorLockExample obj=new MonitorLockExample();
        MonitorThread1Runnable runnable=new MonitorThread1Runnable(obj);

        Thread t1= new Thread(runnable);
        Thread t2=new Thread(()->{obj.task2();});
        Thread t3=new Thread(()->{obj.task3();});

        t1.start();
        t2.start();
        t3.start();
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> compliementMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];

            if (compliementMap.containsKey(compliment))
                return new int[]{compliementMap.get(compliment), i};
            else
                compliementMap.put(compliment, i);


        }
        return new int[]{0};
    }


    public static int maxProfit(int[] prices) {

        if (prices == null || prices.length < 2)
            return 0;

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            minPrice = Math.min(minPrice, prices[i]);

            int currentProfit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, currentProfit);
        }

        return maxProfit;
    }

    public static int maxSubArray(int[] nums) {

        if (nums == null || nums.length == 0)
            return 0;

        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {

            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int maxArea = 0;

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int currentArea = minHeight * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }



    public static boolean palindromNumberString(int num){

        String orignalNumber=String.valueOf(num);
        String reverseNumber=new StringBuilder(orignalNumber).reverse().toString();
        if(orignalNumber.equals(reverseNumber))
            System.out.println("String is paindrom");
      return   orignalNumber.equals(reverseNumber);

    }

    public static boolean palindromNumbers(int num){

        int original =num;
        int reversed=0;

                while(num!=0){
                    int lastDigit=num%10;
                    reversed =reversed*10+lastDigit;
                    num/=10;
                }

                return original==reversed;
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String str1= String.join("",word1);
        String str2 =String.join("",word2);
        if(str1.equals(str2))
            return true;
        else
            return false;

    }
}



