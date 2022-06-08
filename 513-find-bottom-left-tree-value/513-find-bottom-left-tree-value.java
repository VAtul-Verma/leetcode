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
    public int findBottomLeftValue(TreeNode root) {
        if(root==null)return -1;
        Queue<TreeNode>q=new ArrayDeque<>();
        q.add(root);
        int val=0;
        while(q.size()>0){
            int size=q.size();
            boolean flag=true;
           
            while(size-->0){
               TreeNode temp=q.remove();
                if(flag){
                    val=temp.val;
                }
                flag=false;
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
                
            }
        }
        return val;
        
    }
}