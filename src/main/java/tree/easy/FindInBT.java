package tree.easy;

public class FindInBT {

    public static void main(String[] args) {

        SymmetricTree.TreeNode root=new SymmetricTree.TreeNode(1);
        root.left=new SymmetricTree.TreeNode(2);
        root.right=new SymmetricTree.TreeNode(3);

        root.left.left=new SymmetricTree.TreeNode(4);
        root.left.right=new SymmetricTree.TreeNode(5);

        SymmetricTree.TreeNode inBT = findInBT(root, 3);
        if (inBT != null) {
            System.out.println("Found Node: " + inBT);
        } else {
            System.out.println("Not Found");
        }
    }

    public static SymmetricTree.TreeNode findInBT(SymmetricTree.TreeNode root, int val){

        if (root == null) return null;
        if (root.val == val) return root;

        SymmetricTree.TreeNode inLeftBT = findInBT(root.left, val);
        if (inLeftBT != null) return inLeftBT;

        return findInBT(root.right, val);
    }

    public static void printNode(SymmetricTree.TreeNode root){

        if(root!=null){

            System.out.println(root.val);
            printNode(root.left);
            printNode(root.right);

        }
    }
}


