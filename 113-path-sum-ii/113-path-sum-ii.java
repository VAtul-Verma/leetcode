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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>smallans=new ArrayList<>();
        pathSum(root,targetSum,ans,smallans);
        return ans;
    }
    
    public void pathSum(TreeNode root, int targetSum,List<List<Integer>>ans,  List<Integer>smallans) {
        if(root==null)return ;
        if(root.left==null && root.right==null && targetSum-root.val==0 ){
            List<Integer>base=new ArrayList<>(smallans);
            base.add(root.val);
            ans.add(base);
            return ;
            
        }
        smallans.add(root.val);
        pathSum(root.left,targetSum-root.val,ans,smallans);
         pathSum(root.right,targetSum-root.val,ans,smallans);
        smallans.remove(smallans.size()-1);
        
    }
}