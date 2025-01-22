package array.easy;

public class SecondLargestAndSmallestElement {

    public static void main(String[] args) {
        int[] nums={1,2,4,7,7,5};
        String s = secondLargestElementOptimalApproach(nums);
        System.out.println(s);

    }
    public static String secondLargestElement(int[] nums){


        int largestNumber=Integer.MIN_VALUE;
        int secondLargestNumber=Integer.MIN_VALUE;

        int smallestNumber=Integer.MAX_VALUE;
        int secondSmallestNumber=Integer.MAX_VALUE;

//        first we will identify smallest and LargestValue
        for (int i = 0; i <nums.length ; i++) {
            smallestNumber=Math.min(smallestNumber,nums[i]);
            largestNumber=Math.max(largestNumber,nums[i]);
        }

        for (int i = 0;i < nums.length;i++){
            if(nums[i]<secondSmallestNumber && nums[i]!=smallestNumber)
                secondSmallestNumber=nums[i];
            if(nums[i]>secondLargestNumber && nums[i]!=largestNumber)
                secondLargestNumber=nums[i];
        }
        return "SecondLargestNumber "+secondLargestNumber+ "secondSmallestNumber "+secondSmallestNumber;
    }

    public static String secondLargestElementOptimalApproach(int[] nums){


        int largestNumber=Integer.MIN_VALUE;
        int secondLargestNumber=Integer.MIN_VALUE;

        int smallestNumber=Integer.MAX_VALUE;
        int secondSmallestNumber=Integer.MAX_VALUE;


        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]<smallestNumber){
                smallestNumber=nums[i];
                secondSmallestNumber=smallestNumber;
            }else{
                secondSmallestNumber=nums[i];
            }


            if(nums[i]>largestNumber){
                largestNumber=nums[i];
                secondLargestNumber=smallestNumber;
            }else{
                secondLargestNumber=nums[i];
            }
        }
        return "SecondLargestNumber "+secondLargestNumber+ "secondSmallestNumber "+secondSmallestNumber;
    }
}
