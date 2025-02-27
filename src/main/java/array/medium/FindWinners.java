package array.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FindWinners {

    public static void main(String[] args) {
        int [][] matches={{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        List<List<Integer>> winners = findWinners(matches);
        winners.forEach(System.out::println);
    }

    public static List<List<Integer>> findWinners(int[][] matches){

        List<List<Integer>> list=new ArrayList<>();

        HashMap<Integer,Integer> lostMap=new HashMap<>();

        for (int i = 0; i <matches.length ; i++) {
            int loser=matches[i][1];
            Integer lose = lostMap.getOrDefault(loser, 0);
            lostMap.put(loser,lose+1);
        }

        List<Integer> notLost=new ArrayList<>();
        List<Integer> lostOnce=new ArrayList<>();

        for (int i = 0; i <matches.length ; i++) {

            int loser=matches[i][1];
            int winner=matches[i][0];

            if(!lostMap.containsKey(winner)){
                notLost.add(winner);
                lostMap.put(winner,2);
            }

            if(lostMap.get(loser)==1){
                lostOnce.add(loser);
            }

        }
        Collections.sort(notLost);
        Collections.sort(lostOnce);
        list.add(notLost);
        list.add(lostOnce);
return list;
    }
}
