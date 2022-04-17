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
    TreeNode curr=null;
    public TreeNode increasingBST(TreeNode root) {
        if(root==null)return null;
        TreeNode res=new TreeNode(0);
        
        curr=res;
        // System.out.println(curr.left);
        inorder(root);
       
       return res.right;
      
    }
   
    public void inorder(TreeNode node){
        if(node==null){
           return ;
        }
       
        inorder(node.left);
        node.left=null;
        curr.right=node;
        curr=node;
        
        inorder(node.right);
        
        
    }
}