package array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        int numOfRows=5;
        List<List<Integer>> generate = generate(numOfRows);
        generate.forEach(row -> System.out.println(row));
    }

    public static List<List<Integer>> generate(int numOfrows){

        List<List<Integer>> pascalTriangle=new ArrayList<>();

        for (int i = 0; i <numOfrows ; i++) {
            List<Integer> row=new ArrayList<>(i+1);
            for (int j = 0; j <=i ; j++) {
                if(j==0 || j==i){

                    row.add(1);
                }else{

                    int n = pascalTriangle.get(i - 1).get(j)+pascalTriangle.get(i-1).get(j-1);
                   row.add(n);
                }

            }
            pascalTriangle.add(row);
        }

        return pascalTriangle;

    }

}
