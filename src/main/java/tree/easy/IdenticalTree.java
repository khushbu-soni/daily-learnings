package tree.easy;

import java.util.ArrayList;

public class IdenticalTree {

    public static void main(String[] args) {

    }

    public boolean identicalTress(SymmetricTree.TreeNode node1,SymmetricTree.TreeNode node2){

        InorderTraversal in=new InorderTraversal();
        ArrayList<Integer> list1 = in.inorderTravarsal(node1);
        ArrayList<Integer> list2 = in.inorderTravarsal(node2);

        return list1.containsAll(list2) && list2.containsAll(list1);

    }
}
