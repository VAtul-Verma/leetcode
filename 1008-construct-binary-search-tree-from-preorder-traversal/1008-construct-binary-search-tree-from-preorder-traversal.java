/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        int []idx=new int[1];
        int lr=Integer.MIN_VALUE;
        int rr=Integer.MAX_VALUE;
        return bstFromPreorder(preorder,lr,rr,idx);
    }
     public TreeNode bstFromPreorder(int[] preorder,int lr,int rr,int []idx) {
        int i=idx[0];
         if(i>=preorder.length || preorder[i]<lr || preorder[i]>rr)return null;
         
         TreeNode root=new TreeNode(preorder[i]);
         idx[0]++;
         root.left=bstFromPreorder(preorder,lr,root.val,idx);
         root.right=bstFromPreorder(preorder,root.val,rr,idx);
         return root;
    }
}