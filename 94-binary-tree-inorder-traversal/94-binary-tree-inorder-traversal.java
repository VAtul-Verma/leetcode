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
    public List<Integer> inorderTraversal(TreeNode root) {
       if(root==null){
            List<Integer>base=new ArrayList<>();
            return base;
        }
         List<Integer>ans=new ArrayList<>();
        inorderTraversalhelper(root,ans);
        return ans;
        
    }
    public static void inorderTraversalhelper(TreeNode root, List<Integer>ans){
        if(root==null){
            return ;
        }
        
        inorderTraversalhelper(root.left,ans);
          ans.add(root.val);
        inorderTraversalhelper(root.right,ans);
    }  
    
}