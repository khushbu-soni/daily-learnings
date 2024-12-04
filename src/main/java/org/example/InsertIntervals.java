package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertIntervals {

    public static void main(String[] args) {
            int [][] intervals={{1,3},{6,9}};
            int [] newIntervals={2,5};

        int[][] ints = insdertIntervalsBruteForce(intervals, newIntervals);

        Arrays.stream(ints).forEach(ints1 -> {
            System.out.println(Arrays.toString(ints1));
        });
    }

    public static int[][] insdertIntervalsBruteForce(int[][] intervals, int[] newInterval){
        List<int[]> result = new ArrayList<>(); // Because we don't know the fix size at the we will convert it to Array and return
//        int[][] result = new int[intervals.length ][2];
        int i=0;
        int index=0;

            /*  insert all the intervals in result array jo ki new interval se pahle hai
            * that means jiska endInterval < newStartInterval
            * */
        System.out.println("lenght "+intervals.length);
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }


        /*
            * Handle overlapping and merging
            * jaha endInterval > newStartInterval and i <n hai
            *new interval calculate krenge
            * i++ karenge
            * */

            while(i < intervals.length && intervals[i][0] <= newInterval[1]){
                System.out.println("intervals[i][0]"+intervals[i][0]);
                System.out.println("newInterval[1]"+newInterval[1]);
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
                System.out.println("intervals[i][0]"+intervals[i][0]);
                System.out.println("newInterval[1]"+newInterval[1]);
                i++;
            }

            result.add(newInterval);


            while (i<intervals.length){
                result.add(intervals[i]);
                i++;
            }

        return  result.toArray(new int[result.size()][]);
    }


}
