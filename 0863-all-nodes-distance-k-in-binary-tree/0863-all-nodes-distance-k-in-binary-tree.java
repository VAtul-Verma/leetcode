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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        List<Integer>fans=new ArrayList<>();
       kdistance(root,target,k,fans);
        return fans;
    }
    public void kleveldown(TreeNode root,int k,TreeNode blocker,List<Integer>ans){
        if(root==null ||k<0 ||root==blocker){
            return ;
        }
        if(k==0){
            ans.add(root.val);
            return ;
        }
        kleveldown(root.left,k-1,blocker,ans);
        kleveldown(root.right,k-1,blocker,ans);
        
    }
    public int kdistance(TreeNode root,TreeNode tar,int k,List<Integer>ans){
        if(root==null)return -1;  //ans not found;
        if(root==tar){
            kleveldown(root,k,null,ans);
            return 1;  //distance from that node to root;
        }
        int leftdistance=kdistance(root.left,tar,k,ans);
        if(leftdistance!=-1){
            kleveldown(root,k-leftdistance,root.left,ans);
            return leftdistance+1;
        }
        int rightdistance=kdistance(root.right,tar,k,ans);
        if(rightdistance!=-1){
            kleveldown(root,k-rightdistance,root.right,ans);
            return rightdistance+1;
        }
        return -1;
    }
  
}