package array.medium;

import java.util.Arrays;

public class CountServersThatCommunicate {

    public static void main(String[] args) {
        int[][] nums={{1,1,1,0,0,1},{1,1,0,0,1,1},{0,0,0,0,0,0},{1,1,0,0,0,1}};

        int num = countServersBestApproch(nums);
        System.out.println(num);
    }

    public static  int countServers(int[][] grid){

        int m=grid.length; int n=grid[0].length;

        int resultCounter=0;

//        Traverse through grid
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if(grid[i][j]==1){
                    boolean canCommunicate=false;

                    // check in ith row

                    for(int col=0;col<n;col++) {
                        if (grid[i][col] == 1 && col != j) {
                            canCommunicate = true;
                            break;
                        }
                    }
                    if(canCommunicate){
                            resultCounter++;
                        }else{

                            //check in column

                            for (int row = 0; row <n ; row++) {
                                if(grid[row][j]==1 && row!=i){
                                    canCommunicate = true;
                                    break;
                                }
                            }

                        if (canCommunicate) {
                            resultCounter++;
                        }

                        }


                }
            }
        }


        return resultCounter;
    }

    public static  int countServersBetterApproch(int[][] grid){

        int m=grid.length; int n=grid[0].length;

        int resultCounter=0;
        int[] indexColCount=new int[n];
        int[] indexRowCount=new int [m];

//        Traverse through grid
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j]==1){
                    indexRowCount[i]++;
                    indexColCount[j]++;
                }
            }
        }

        for (int row = 0; row < m; row++) {
            for (int col = 0; col <n ; col++) {

                if(grid[row][col]==1 && (indexColCount[col]>1 || indexRowCount[row]>1)){
                    resultCounter++;
                }

            }
        }

        return resultCounter;
    }

    public static int countServersBestApproch(int[][] grid){

        int ansCount=0;

        int m=grid.length;
        int n=grid[0].length;

        int[] colServerCount =new int[n];
        int[] rowAloneServerCol =new int[m];
        Arrays.fill(rowAloneServerCol,-1);

        for (int row = 0; row <m ; row++) {
            int countServerRow=0;
            for (int col = 0; col <n ; col++) {
                if (grid[row][col] == 1) {
                    countServerRow++;
                    colServerCount[col]++;
                    rowAloneServerCol[row] = col;
                }
            }

                if(countServerRow>1){
                    ansCount+=countServerRow;
                    rowAloneServerCol[row]=-1;
                }


        }

//        check alone server in each row
        for (int row = 0; row <m ; row++) {
            if(rowAloneServerCol[row]!=-1){
                int col=rowAloneServerCol[row];
                if(colServerCount[col]>1)
                    ansCount+=1;
            }

        }

        return ansCount;

    }
}
