package tree.easy;

import java.util.List;

public class TreeBasics {


    public static void main(String[] args) {
        BInaryTreeArrayImp bt=new BInaryTreeArrayImp();

        bt.parant("A");
        bt.set_left("B",0);
        bt.set_right("C",0);
        bt.set_left("D",1);
        bt.set_right("E",1);
        bt.set_right("F",2);
        bt.printTree();
    }


    public static void printParents(int node , List<List<Integer>> adj, int parent){

        if(parent==0){
            System.out.println(node+"-> Root");
        }else {
            System.out.println(node+"->" +parent);


        }


    }
}
