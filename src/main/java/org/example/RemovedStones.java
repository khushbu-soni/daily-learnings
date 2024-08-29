package org.example;

public class RemovedStones {

    public static void main(String[] args) {
        int[][] stones = {{0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 2}, {2, 3}, {3, 3}};
        System.out.println(removedStones(stones));  // Output should be 5
    }

    public static int removedStones(int [][] stones){
        int n =stones.length;
        int group=0;
        boolean[] visited= new boolean[n];

        for(int i=0;i<n;i++){
            if(visited[i])
                continue;

            dfs(stones,i,visited);
            group++;
        }


        return n-group;

    }



    private static void dfs(int[][] stones, int index ,boolean[] visited) {


        visited[index]=true;

        for(int i=0;i<stones.length;i++){

            int row =stones[index][0];
            int col=stones[index][1];
            if(!visited[i] && (stones[i][0]==row ||  stones[i][1]==col)  ){
                dfs(stones,i,visited);
            }
        }

    }
}
