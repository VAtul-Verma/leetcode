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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer>ans=new ArrayList<>();
        inoder(root,ans);
        int i=0;
        int j=ans.size()-1;
        while(i<j){
            int target=ans.get(i)+ans.get(j);
            if(target==k){
                return true;
            }else if(target>k){
                j--;
            }else if(target<k){
                i++;
            }
        }
        return false;
    }
    public void inoder(TreeNode root,ArrayList<Integer>ans){
        if(root==null){
            return ;
        }
        inoder(root.left,ans);
        ans.add(root.val);
        inoder(root.right,ans);
        
    }
}