package org.example;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        List<Integer> result = spiralMatrix(matrix);
        System.out.println(result);
    }

    public static List<Integer> spiralMatrix(int[][] matrix){

        List<Integer> list=new ArrayList<>();

//        first ww will be having four pointers
        int top=0;int bottom=matrix.length-1;
        int left=0; int right=matrix[0].length-1;
        // jab tak below condition satisfied hai we will keep calculate the spiral matrix.
        while(left <= right && top<=bottom){
        //Traverse from left to right along with the top
            for(int i =left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;

//            traverse from top to bottom along with right

            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;

//            traverse from right to left along with bottom

//            if (top <= bottom) {
                for (int i=right;i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
//            }

//            traverse from bottpm to top along with left

//            if(left<=right){
                for(int i=bottom;i>=top;i--){
                 list.add(matrix[i][left]);
                }
                left++;
//            }

        }



        return list;
    }
}
