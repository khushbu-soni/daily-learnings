package org.example;

import java.util.Arrays;
import java.util.List;

public class IncreementSubmatricsByOne {

    public static void main(String[] args) {
        int[][] nums={{1,1,2,2},{0,0,1,1}};
        int[][] matrix = createMatrix(3, nums);
        for(int i=0;i<3;i++){
            for(int j=0; j<3 ;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public  static  int[][] createMatrix(int n,int[][] queries){

        int[][] mat=new int[n][n];

        for (int[] ints : queries) {
            int startRow=ints[0];
            int startCol=ints[1];
            int endRow=ints[2];
            int endCol=ints[3];
            if (startRow < 0 || startCol < 0 || endRow >= n || endCol >= n) {
                throw new IllegalArgumentException("Query indices out of bounds");
            }
            for(int i=startRow;i<=endRow;i++){
                for(int j=startCol;j<=endCol;j++){
                    mat[i][j]++;
                }


            }

        }

        return mat;
    }


}
