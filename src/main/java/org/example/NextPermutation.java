package org.example;

/*
* 1.	Iterate Through the Array to Find the Pivot:
o	Traverse the array from the end (n−1n - 1n−1) to the beginning (000).
o	Compare consecutive elements: if arr[i−1]<arr[i]arr[i - 1] < arr[i]arr[i−1]<arr[i], it indicates the position i−1i - 1i−1 (centerIndex) where a swap is needed to create the next permutation.
o	Break the loop once the pivot (centerIndex) is found.
2.	Find the Swap Index:
o	Iterate through the array from the end (n−1n - 1n−1) to the pivot position.
o	Find the smallest number greater than arr[centerIndex]arr[centerIndex]arr[centerIndex].
o	This number's position becomes the swapIndex.
3.	Swap the Center Value with the Swap Value:
o	Swap the numbers at centerIndexcenterIndexcenterIndex and swapIndexswapIndexswapIndex.
4.	Reverse the Array From centerIndex + 1 to the End:
o	Reverse the portion of the array from centerIndex+1centerIndex + 1centerIndex+1 to n−1n - 1n−1.
o	This step ensures the smallest lexicographical order for the remaining portion of the array.

* */

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
