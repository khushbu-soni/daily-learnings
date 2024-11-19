package org.example;

import java.util.Arrays;

public class NextPermutation {

    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        int[] nums = nextPermutation(num);
        for (int i : nums) {
            System.out.println(" value " + i);
        }

    }

    public static int[] nextPermutation(int[] nums) {

        int n = nums.length;
        int gola_index = -1;
        for (int i = n - 1; i > 0; i--) {
//            find Gola index
            if (nums[i] > nums[i - 1]) {
                gola_index = i - 1;
                break;
            }
        }

        if (gola_index != -1) {
            int swap_index = gola_index;

            for (int j = n - 1; j >= gola_index + 1; j--) {
                if (nums[j] > nums[gola_index])
                    swap_index = j;
                break;
            }

            swap(nums, gola_index, swap_index);

        }
        reverse(nums, gola_index + 1);
        return nums;
    }

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void reverse(int[] num, int start) {

        int end = num.length - 1;

        while (start < end) {
            swap(num, start, end);
            start++;
            end--;
        }
    }
}
