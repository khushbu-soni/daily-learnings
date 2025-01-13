package array.easy;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {
    int[] nums1 ={0, 0, 0};
    int[] nums2 ={2,5,6};

        int[] ints = mathod1ToMerge(nums1, nums2, 0, 3);

        System.out.println(Arrays.toString(ints));
    }

    public static int[] mathod1ToMerge(int[] nums1,int[] nums2, int m, int n) {




        int i=m-1; int j=n-1; int k=m+n-1;

        while (i>=0 && j>=0){

            if(nums1[i]<nums2[j]){
                nums1[k--]=nums2[j--];
            }else{
                nums1[k--]=nums1[i--];

            }

        }

        while(j>=0){
            nums1[k--]=nums2[j--];
        }

    return nums1;
    }
}
