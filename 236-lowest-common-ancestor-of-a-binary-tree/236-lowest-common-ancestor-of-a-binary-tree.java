/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode lca=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        find(root,p,q);
        return lca;
    }
    public boolean find(TreeNode root,TreeNode p,TreeNode q){
        if(root==null)return false;
        boolean left=find(root.left,p,q);
        boolean right=find(root.right,p,q);
        if(left && right){
            lca=root;
        }
        if(root==p || root==q){
            if(left ||right){
                lca=root;
            }
            return true;
        }
        return left || right;
    }
}