package array.easy;

public class BestTimetoBuySell {
    public static void main(String[] args) {
        int[] nums={7,1,5,3,6,4};
        int i = maxProfixSecond(nums);
        System.out.println(i);
    }

    public  static int maxProfit(int[] nums){

        int maxProfit=Integer.MIN_VALUE;

        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {

            if(nums[j]>nums[i]){
                maxProfit=Math.max(maxProfit,nums[j]-nums[i]);
            }
            }
        }
        return maxProfit;
    }

    public  static int maxProfitOtp(int[] nums){

        int maxProfit=Integer.MIN_VALUE;
        int minPrice=Integer.MAX_VALUE;

        for (int i = 0; i <nums.length ; i++) {

            minPrice=Math.min(minPrice,nums[i]);
            maxProfit=Math.max(maxProfit,nums[i]-minPrice);
        }


        return maxProfit;
    }

    public static int maxProfixSecond(int[] nums){
        int maxProfit=0;

        for (int i = 1; i <nums.length ; i++) {

            if(nums[i] > nums[i-1])
                maxProfit+=nums[i]-nums[i-1];
        }
        return maxProfit;
    }
}
