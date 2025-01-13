package array.easy;



public class SortedArrayToBST {

    public static void main(String[] args) {
        int[] num={-10,-3,0,5,9};
        TreeNode treeNode = sortedArrayTOBST(num);

        printRoot(treeNode);
    }

    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;


        TreeNode(){};

        TreeNode(int val){
            this.val=val;
        }

        TreeNode(int val,TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;

        }
    }

    public static  TreeNode sortedArrayTOBST(int[] num){

       if(num==null || num.length==0 ) return null;
       int left=0; int right=num.length-1;
      return construnctBST(num,left,right);
    }

    public static TreeNode construnctBST(int[] num,int left, int right){

        if(left>right) return null;

        int mid=left+(right-left)/2;

        TreeNode root=new TreeNode(num[mid]);
        root.left=construnctBST(num,left,mid-1);
        root.right=construnctBST(num,mid+1,right);

        return root;
    }

    public static void printRoot(TreeNode root){
        if(root!=null){
            printRoot(root.left);
            System.out.println(root.val +" ");
            printRoot(root.right);
        }
    }
}
