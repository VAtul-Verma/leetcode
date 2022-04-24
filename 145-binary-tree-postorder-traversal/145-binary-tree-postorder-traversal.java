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
    public List<Integer> postorderTraversal(TreeNode root) {
          if(root==null){
            List<Integer>base=new ArrayList<>();
            return base;
        }
         List<Integer>ans=new ArrayList<>();
        postorderTraversalhelper(root,ans);
        return ans;
        
    }
    public static void postorderTraversalhelper(TreeNode root, List<Integer>ans){
        if(root==null){
            return ;
        }
        
        postorderTraversalhelper(root.left,ans);
         
        postorderTraversalhelper(root.right,ans);
         ans.add(root.val);
    }  
}