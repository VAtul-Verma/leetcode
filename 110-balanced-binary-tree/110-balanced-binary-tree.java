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
    public static class Bpair{
        boolean isbal=true;
        int h=-1;
    }
    
    public Bpair is_Balanced(TreeNode root) {
        if(root==null){
            Bpair base=new Bpair();
        return base;
    }
        Bpair lp=is_Balanced(root.left);
         Bpair rp=is_Balanced(root.right);
        Bpair mypair=new Bpair();
        mypair.isbal=lp.isbal && rp.isbal;
        if(mypair.isbal && Math.abs(lp.h-rp.h)<2){
            mypair.h=Math.max(lp.h,rp.h)+1;
        }else{
            mypair.isbal=false;
        }
        return mypair;
    }

    public boolean isBalanced(TreeNode root) {
        return is_Balanced(root).isbal;
    }
}