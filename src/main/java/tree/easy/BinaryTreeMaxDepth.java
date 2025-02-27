package tree.easy;

public class BinaryTreeMaxDepth {

    public static int height(SymmetricTree.TreeNode root){

        if(root==null)
            return -1;

        int lHeight=height(root.left);
        int rHeight=height(root.right);


        return Math.max(lHeight,rHeight)+1;
    }
}
