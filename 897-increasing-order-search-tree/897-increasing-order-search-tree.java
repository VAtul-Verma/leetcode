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
    public TreeNode increasingBST(TreeNode root) {
        if(root==null)return null;
        inorder(root);
        for(int i=0;i<ans.size()-1;i++){
            ans.get(i).right=ans.get(i+1);
            ans.get(i).left=null;
        }
        ans.get(ans.size()-1).right=null;
        ans.get(ans.size()-1).left=null;
       return ans.get(0);
      
    }
    ArrayList<TreeNode>ans=new ArrayList<>();
    public void inorder(TreeNode root){
        if(root==null){
           return ;
        }
       
        inorder(root.left);
         
        ans.add(root);
        inorder(root.right);
        
        
    }
}