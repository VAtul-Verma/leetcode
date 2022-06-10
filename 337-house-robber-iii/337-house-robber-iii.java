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
    public int rob(TreeNode root) {
        int []ans=robH(root);
        return Math.max(ans[0],ans[1]);
       
    }
     public int [] robH(TreeNode root) {
        if(root==null)return new int[2];
         
         int []lr=robH(root.left);
         int []rr=robH(root.right);
         int []myres=new int[2];
         myres[0]=lr[1]+rr[1]+root.val;
         myres[1]=Math.max(lr[0],lr[1])+Math.max(rr[0],rr[1]);
         return myres;
    }
}