package tree.easy;

import java.util.*;
import java.util.stream.Collectors;

public class TreeTraversals {

    public static void main(String[] args) {

        SymmetricTree.TreeNode root = new SymmetricTree.TreeNode(1);
        root.left = new SymmetricTree.TreeNode(2);
        root.right = new SymmetricTree.TreeNode(3);
        root.left.left = new SymmetricTree.TreeNode(4);
        root.left.right = new SymmetricTree.TreeNode(5);
        root.right.right = new SymmetricTree.TreeNode(6);

        // Function call
        System.out.println(
                "Tree traversal of binary tree is: ");
        ArrayList<Integer> integers = inOrderIterative(root);
        List<List<Integer>> lists = levelOrder(root);
       // lists.forEach(System.out::println);
       String result= lists.stream()
                .map(list -> list.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(", "))) // Join elements with ", "
                .collect(Collectors.joining("\n")); // Join levels with newline
        System.out.println(result);
        System.out.println("done");
    }

    public static void preOrderRec(SymmetricTree.TreeNode node){

        if(node!=null){
            System.out.println(node.val);
            preOrderRec(node.left);
            preOrderRec(node.right);
        }

    }

    public static ArrayList<Integer> preOrderIterative(SymmetricTree.TreeNode node){
        ArrayList<Integer> res=new ArrayList<>();

        if(node==null)
            return res;

        Stack<SymmetricTree.TreeNode> s=new Stack<SymmetricTree.TreeNode>();

        s.push(node);

        while (!s.isEmpty()){

            SymmetricTree.TreeNode temp = s.pop();
            res.add(temp.val);
            if(temp.right!=null){
                s.push(temp.right);
            }

            if(temp.left!=null){
                s.push(temp.left);
            }


        }

    return res;
    }

    public static ArrayList<Integer> inOrderIterative(SymmetricTree.TreeNode root){

        ArrayList<Integer> res=new ArrayList<>();
        Stack<SymmetricTree.TreeNode> s=new Stack<SymmetricTree.TreeNode>();
        SymmetricTree.TreeNode currentNode=root;

        boolean isVisited=false;

        while (!isVisited){


            if(currentNode!=null){
                s.push(currentNode);
                currentNode=currentNode.left;
            }else{
                if(s.isEmpty()){
                    isVisited=true;
                }else{

                    currentNode=s.pop();
                    res.add(currentNode.val);
                    currentNode=currentNode.right;
                }
            }


        }

    return res;

    }

    public static List<List<Integer>> levelOrder(SymmetricTree.TreeNode node){

        List<List<Integer>> res=new ArrayList<>();

        if(node==null) return res;

        Queue<SymmetricTree.TreeNode> queue=new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()){

            int levelSize=queue.size();

            List<Integer> list=new ArrayList<>();
            for (int i = 0; i <levelSize ; i++) {
                SymmetricTree.TreeNode poll = queue.poll();
                list.add(poll.val);

                if(poll.left!=null) queue.add(poll.left);
                if(poll.right!=null) queue.add(poll.right);

            }

            res.add(list);

        }

        return res;



    }
}
