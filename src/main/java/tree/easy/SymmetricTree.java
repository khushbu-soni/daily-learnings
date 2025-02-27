package tree.easy;

public  class SymmetricTree {

    public static class  TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val=val;
            this.left=this.right=null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", left=" + (left != null ? left.val : "null") +
                    ", right=" + (right != null ? right.val : "null") +
                    '}';
        }
    }


    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);

    }


    private  boolean isMirror(TreeNode t1,TreeNode t2){

        if(t1== null && t2==null) return true;
        if(t1== null || t2==null) return false;

        return (t1.val==t2.val && isMirror(t1.left,t2.right) && isMirror(t1.right,t2.left));

    }

    public static void main(String[] args) {
        SymmetricTree tree= new SymmetricTree();

        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(2);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(4);
        root.right.right=new TreeNode(3);
        root.right.left=new TreeNode(4);

//        System.out.println(tree.isMirror(tree));
    }


}
