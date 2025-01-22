package array.medium;

import java.util.HashMap;

public class FirstPaintedRowOrCol {

    public static void main(String[] args) {
        int[] arr={1,3,4,2};
        int[][] mat={{1,4},{2,3}};
        System.out.println(firstCompleteIndexBestApproach(arr,mat));
    }

    public static int firstCompleteIndex(int[] arr, int[][] mat){

        int m=mat.length;
        int n=mat[0].length;
        // HashMap to maintain the element and it's corsponding values in Mat on row col
        HashMap<Integer,int[]> mp=new HashMap<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n ; j++) {
                int val=mat[i][j];
               mp.put(val,new int[]{i,j});
            }
        }

        for (int i = 0; i <arr.length ; i++) {
            int val=arr[i];
            int[] coordinates=mp.get(val);
            int row=coordinates[0];
            int col=coordinates[1];

            mat[row][col]=-1;
            if(checkRowPainted(mat,row) || checkColPainted(mat,col) ){
                return i;
            }
        }
        return -1;

    }

    public  static boolean checkRowPainted(int[][] mat,int  row){

        for (int i = 0; i < mat.length; i++) {

            if(mat[row][i]>0) return false;
        }
        return true;
    }

        public  static boolean checkColPainted(int[][] mat,int  col){

            for (int i = 0; i < mat.length; i++) {

                if(mat[i][col]>0) return false;
            }

        return true;
    }

    public static int firstCompleteIndexBetterApproach(int[] arr, int[][] mat){

        int m=mat.length;
        int n=mat[0].length;
        // HashMap to maintain the element and it's corsponding values in Mat on row col
        HashMap<Integer,int[]> mp=new HashMap<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n ; j++) {
                int val=mat[i][j];
                mp.put(val,new int[]{i,j});
            }
        }

        int[] rowCountPaint=new int[m];
        int[] colCountPaint=new int[n];

        for (int i = 0; i <arr.length ; i++) {
            int val=arr[i];
            int[] coordinates=mp.get(val);
            int row=coordinates[0];
            int col=coordinates[1];

            rowCountPaint[row]++;
            colCountPaint[col]++;

            if(rowCountPaint[row]==n || colCountPaint[col]==m)
                return i;

        }
        return -1;

    }

    public static int firstCompleteIndexBestApproach(int[] arr, int[][] mat){
/*
* We will store array element and it's index in MAP
*
* Then we will try to find min index in each row and each column
*
* first we will check for all rows
* we will find out last index in for eacha row
* * after that we will check for all cols
 * we will find out last index in for each col
 *
 * */
        int m=mat.length;
        int n=mat[0].length;
        // HashMap to maintain the element, and it's corresponding values in Mat on row col
        HashMap<Integer,Integer> mp=new HashMap<>();

        for (int i = 0; i < arr.length ; i++) {
            mp.put(arr[i],i);
        }

        int minIndex=Integer.MAX_VALUE;

        for (int row = 0; row <m ; row++) {

            int lastIndex=Integer.MIN_VALUE;
            for (int col = 0; col < n; col++) {
                int val=mat[row][col];
                lastIndex=Math.max(lastIndex,mp.get(val));
            }

            minIndex=Math.min(minIndex,lastIndex);
        }

        for (int col = 0; col <n ; col++) {

            int lastIndex=Integer.MIN_VALUE;
            for (int row = 0; row < m; row++) {
                int val=mat[row][col];
                lastIndex=Math.max(lastIndex,mp.get(val));
            }

            minIndex=Math.min(minIndex,lastIndex);
        }
        return minIndex;

    }
}
