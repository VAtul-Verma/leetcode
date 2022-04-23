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
    private int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)return 0;
       isleftsum(root,false);
        return sum;
    }
    public void isleftsum(TreeNode root,boolean isleft){
        if(isleft && root.left==null && root.right==null){  //means its a leave node;
            sum+=root.val;
            return ;
            
        }
        if(root.left!=null){
            isleftsum(root.left,true);
        }
        if(root.right!=null){
            isleftsum(root.right,false);
        }
    
    }
}