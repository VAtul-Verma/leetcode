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
    public int[] robhelper(TreeNode root) {
        if(root==null)return new int[2];
        int []lr=robhelper(root.left);
        int []rr=robhelper(root.right);
        int []myres=new int[2];
        myres[0]=lr[1]+rr[1]+root.val;  //rob occures on current node;
        myres[1]=Math.max(lr[1],lr[0])+Math.max(rr[0],rr[1]);
        return myres;
    }
    
     public int rob(TreeNode root) {
        int ans[]=robhelper(root);
         return Math.max(ans[0],ans[1]);
         
    }
}