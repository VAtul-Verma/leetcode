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
    public int height(TreeNode root){
        if(root==null)return -1;
        return Math.max(height(root.left),height(root.right))+1;
    }
    public int []diameterOfBinaryTreeH(TreeNode root) {
        if(root==null)return  new int []{0,-1};
        int [] lr=diameterOfBinaryTreeH(root.left);
        int []rr=diameterOfBinaryTreeH(root.right);
        int []myres=new int[2];
        myres[0]=Math.max(Math.max(lr[0],rr[0]),lr[1]+rr[1]+2);
        myres[1]=Math.max(lr[1],rr[1])+1;
        return myres;
    }
    public int diameterOfBinaryTree(TreeNode root){
        int ans[]=diameterOfBinaryTreeH(root);
        return ans[0];
        
    }
    
}