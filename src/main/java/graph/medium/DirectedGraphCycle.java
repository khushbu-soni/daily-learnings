package graph.medium;

import java.util.ArrayList;
import java.util.List;

public class DirectedGraphCycle {

    public static void main(String[] args) {
        int vertices=4;
        List<List<Integer>> graph=new ArrayList<>();

        for (int i = 0; i <vertices ; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(1).add(2);
        graph.get(2).add(3);


        if(isCycle(vertices,graph)){
            System.out.println("Cycle detacted in the graph");
        }else{
            System.out.println("No Cycle detacted in the graph");

        }
    }

    public static boolean isCycle(int ver, List<List<Integer>> graph){
        boolean[] visited=new boolean[ver];
        boolean[] recStack=new boolean[ver];

        for (int i = 0; i <ver ; i++) {
            if(!visited[i]){
                if(dfs(i,graph,visited,recStack)){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean dfs(int node, List<List<Integer>> graph, boolean[] visited, boolean[] recStack){

        visited[node]=true;
        recStack[node]=true;

//        Explore all neighbours
        for (int neighbour: graph.get(node)){
//            if neighbour is not visited and recursively visited
            if(!visited[neighbour] && dfs(neighbour,graph,visited,recStack)) {
                return true;
            }
//            neighbour is in recursion stack and cycle exists
            else if (recStack[neighbour])
                return true;

        }
        recStack[node] = false;
        return false;
    }
}
