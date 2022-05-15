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
    int tsum=0;
    public int deepestLeavesSum(TreeNode root) {

        int depth=deepnode(root);
    
        sum(root,1,depth);
        return tsum;
        
    }
    public int deepnode(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=deepnode(root.left);
        int right=deepnode(root.right);
        return Math.max(left,right)+1;
    }
    public int sum(TreeNode root,int currdepth,int depth){
        if(root!=null){
            if(currdepth==depth){
                tsum+=root.val;
            }
            sum(root.left,currdepth+1,depth);
                sum(root.right,currdepth+1,depth);
        }
       return tsum;
    }
}