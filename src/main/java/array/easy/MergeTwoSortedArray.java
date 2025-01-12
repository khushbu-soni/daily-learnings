package array.easy;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {

    }

    public static int[] mathod1ToMerge(int[] nums1,int[] nums2, int m, int n) {
        int[] newArray = new int[m + n];


        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {

            if (nums1[i] <= nums2[j]) {
                nums1[k++] = nums1[i++];
            } else {
                newArray[k++] = nums1[j++];

            }

        }

    return nums1;
    }
}
