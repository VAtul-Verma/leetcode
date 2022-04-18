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
    public int kthSmallest(TreeNode root, int k) {
        if(root==null){
            return 0;
        }
        ArrayList<TreeNode>ans=new ArrayList<>();
        helper(root,ans);
      return ans.get(k-1).val;
        
        
    }
    public static void helper(TreeNode root,ArrayList<TreeNode>list){
       if(root==null){
           return ;
       }
        helper(root.left,list);
        list.add(root);
        helper(root.right,list);
    
    }
}