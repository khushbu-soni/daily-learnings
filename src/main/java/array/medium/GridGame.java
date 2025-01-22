package array.medium;

public class GridGame {

    public static void main(String[] args) {
        int[][] grid={{2,5,4},{1,5,1}};
        long l = gridGame(grid);
        System.out.println(l);
    }

    public static  long gridGame(int[][] grid){

        long firstRowRemainSum=0;
        long minimizedRobot2Sum = Long.MAX_VALUE;
        long secondRowRemainSum = 0;
        for (int num:grid[0]){
            firstRowRemainSum+=num;
        }

        for (int Robot1Col = 0; Robot1Col < grid[0].length; Robot1Col++) {
            // Robot1 took this strategy
            firstRowRemainSum-=grid[0][Robot1Col];
            // Robot2 will try to do best after Robot1 has taken the above strategy
            long bestOfRobot2 = Math.max(firstRowRemainSum, secondRowRemainSum);

            minimizedRobot2Sum = Math.min(minimizedRobot2Sum, bestOfRobot2);

            secondRowRemainSum += grid[1][Robot1Col];
        }


            return minimizedRobot2Sum;

    }
}
