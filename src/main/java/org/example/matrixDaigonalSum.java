package org.example;

import java.util.Arrays;

public class matrixDaigonalSum {


    public static void main(String[] args) {
        int [][] mat= new int[][]{{1, 2}, {4, 5}};
            int[] originalArray={2,2,3,4};
//        int sum = daigonalSum(mat);
        int[][] ints = construct2DArray(originalArray, 2, 2);
        for (int i=0;i<ints.length;i++){
            for (int j=0;j<ints.length;j++)
                System.out.println(ints[i][j]);
        }
//        System.out.println(sum);
    }

    public static  int daigonalSum(int [][] mat){
        int sum=0;
        int n=mat.length;
        for(int i=0;i<n;i++){
            sum+=mat[i][i];
            sum+=mat[i][n-i-1];
        }

        if(n%2!=0){
            sum-=mat[n/2][n/2];
        }
        return sum;

    }

    public static int[][] construct2DArray(int[] originalArray, int row, int col){
        if(originalArray.length!=row*col)
            return new int[0][0];
        int[][] newArray=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++ )
                newArray[i][j]=originalArray[i*col+j];
        }

        return newArray;
    }
}
