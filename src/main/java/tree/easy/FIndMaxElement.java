package tree.easy;

import java.util.LinkedList;
import java.util.Queue;

public class FIndMaxElement {

    public static void main(String[] args) {

        SymmetricTree.TreeNode root=new SymmetricTree.TreeNode(1);
        root.left=new SymmetricTree.TreeNode(2);
        root.right=new SymmetricTree.TreeNode(3);

        root.left.left=new SymmetricTree.TreeNode(4);
        root.left.right=new SymmetricTree.TreeNode(5);

        int maxElement = maxElementIterative(root);
        System.out.println(maxElement);

    }


    public static int findMaxElement(SymmetricTree.TreeNode root){

        int maxElement=Integer.MIN_VALUE;
        if(root==null) return maxElement;


        if(root!=null){

            int lMax=findMaxElement(root.left);
            int rMax=findMaxElement(root.right);

             maxElement = Math.max(root.val, Math.max(lMax, rMax));

        }
        return maxElement;

    }

    public static int maxElementIterative(SymmetricTree.TreeNode root){

        int maxElement=Integer.MIN_VALUE;
        if(root==null) return maxElement;

        Queue<SymmetricTree.TreeNode> queue=new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){

            SymmetricTree.TreeNode pollNode=queue.poll();
            if(pollNode!=null){
                maxElement = Math.max(pollNode.val, maxElement);

                if(pollNode.left!=null) queue.offer(pollNode.left);
                if(pollNode.right!=null) queue.offer(pollNode.right);

            }

        }
return maxElement;

    }
}
