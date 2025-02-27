package tree.easy;

import java.util.ArrayList;
import java.util.Stack;

public class InorderTraversal {

    /*
    * We will be have Empty ArrayList
    * We will have ine Empty Stack
    * Push all the nodes to the stack
    *
    *
    *
    * */

    public static void main(String[] args) {

    }

    public ArrayList<Integer> inorderTravarsal(SymmetricTree.TreeNode root){

        ArrayList<Integer> res=new ArrayList<>();
        Stack<SymmetricTree.TreeNode> st=new Stack<>();
        SymmetricTree.TreeNode currentNode=root;
        while (currentNode!=null || !st.isEmpty()){

            while (currentNode!=null){
                st.push(currentNode);
                currentNode=currentNode.left;
            }

            SymmetricTree.TreeNode pop = st.pop();
            res.add(pop.val);
            currentNode=pop.right;

        }

        return res;
    }


}
