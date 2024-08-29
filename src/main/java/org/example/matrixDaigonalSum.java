package org.example;

import java.util.Arrays;

public class matrixDaigonalSum {


    public static void main(String[] args) {
        int [][] mat= new int[][]{{1,5},{7,3},{3,5}};
            int[] originalArray={2,2,3,4};
//        int sum = daigonalSum(mat);
//        int mul = multiplicationsOfDaigonal(mat);
//        int[][] ints = construct2DArray(originalArray, 2, 2);
//        int[] ints1 = runnignSum1DArray(originalArray);
        int richestCustomer = findTheRichestCustomer(mat);
//        for (int i : ints1) {
//            System.out.println(i);
//        }

//        int speciaPositionBF = findSpeciaPositionBF(mat);
//        int speciaPosition = findSpeciaPosition(mat);
//        System.out.println("speciaPositionBF "+speciaPositionBF);
//        System.out.println("speciaPosition "+speciaPosition);
        System.out.println("richestCustomer "+richestCustomer);


//        for (int i=0;i<ints.length;i++){
//            for (int j=0;j<ints.length;j++)
//                System.out.println(ints[i][j]);
//        }
////        System.out.println(sum);
//        System.out.println(mul);
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

    public static int multiplicationsOfDaigonal(int [][] mat){
        int leftDiagonal=1;
        int righDiagonal=1;
        int n =mat.length;
        for(int i =0; i<n ;i++){

            leftDiagonal*=mat[i][i];
            righDiagonal*=mat[i][n-i-1];

        }

        return leftDiagonal*righDiagonal;
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

    public static int findSpeciaPositionBF(int [][] mat){

        int result=0;

//        find the length of row
        int lengthOfRow=mat.length;
        int lengthOfCol=mat[0].length;
        boolean specialPosition = true;
//        For Each Row and colmn check the spacial positions

        for (int row =0; row<lengthOfRow; row++){
            for (int col=0; col<lengthOfCol; col++){

                if(mat[row][col]==0) continue;

//                check for all row and col
                for(int r=0;r<lengthOfRow;r++){
                    if (r != row && mat[r][col] == 1) {
                        specialPosition = false;
                        break;
                    }

                }

                for(int c=0; c< lengthOfCol; c++) {
                    if (c != col && mat[c][row] == 1) {
                        specialPosition = false;
                        break;

                    }
                }
                if(specialPosition)
                    result++;
            }
        }

        return result;
    }


    public static int findSpeciaPosition(int [][] mat){
        int result=0;

        int lengthOfRow=mat.length;
        int lengthOfColumn=mat[0].length;

        int[] rowCount=new int[lengthOfRow];
        int[] colCount=new int[lengthOfColumn];

        for(int row=0;row<lengthOfRow;row++){
            for (int col=0;col<lengthOfColumn;col++){

                if(mat[row][col]==1){

                    rowCount[row]++;
                    colCount[col]++;

                }



            }
        }

        for (int row =0;row<lengthOfRow;row++) {
            for (int col = 0; col < lengthOfColumn; col++) {

                if (mat[row][col] == 0)
                    continue;

                if (rowCount[row] == 1 && colCount[col] == 1) {
                    result++;
                }
            }
        }

        return result;

    }


    public  static int[] runnignSum1DArray(int[] array){
        int sum=0;
        int lenghtOfArray=array.length;
        for(int element=0; element<lenghtOfArray;element++){

            sum+=array[element];
            array[element]=sum;
        }
        return array;
    }

    public static int findTheRichestCustomer(int[][] customers){

        int richestCustomer=0;
        int customersCount = customers.length;
        int[] customersWealth=new int[customersCount];
        for(int customer=0;customer <customersCount ; customer++){

            int customerWealth=0;

            for(int account=0;account < customers[0].length;account++){

                customerWealth+=customers[customer][account];
            }

            customersWealth[customer]=customerWealth;

        }
        richestCustomer = Arrays.stream(customersWealth).max().getAsInt();
        return richestCustomer;

    }
}
