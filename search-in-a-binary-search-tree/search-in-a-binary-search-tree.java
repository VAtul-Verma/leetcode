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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null){
            return root;
        }
        
    
        TreeNode temp=null;
        if(root.val==val){    //if the value is found we simply return the node where val match
             temp=root;
            return temp;
        }
        else if(root.val<val){    //if value is greater the root val as a property of BST the value must be in right side
             temp=searchBST(root.right,val);
        }else if(root.val>val){      //if value is less the root val as a property of BST the value must be in left side
             temp=searchBST(root.left,val);
        }
        
        return temp;
    }
}