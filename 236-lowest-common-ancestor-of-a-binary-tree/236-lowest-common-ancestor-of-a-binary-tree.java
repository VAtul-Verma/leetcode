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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode>left= new ArrayList<>();
            nodetorootpath(root,p,left);
        ArrayList<TreeNode>right=new ArrayList<>();
            nodetorootpath(root,q,right);
        int i=left.size()-1;
        int j=right.size()-1;
        while(i>=0 && j>=0){
            if(left.get(i)==right.get(j)){
                i--;
                j--;
            }else{
                break;
            }
        }
        return left.get(i+1);
    }
    public boolean nodetorootpath(TreeNode node,TreeNode d1, ArrayList<TreeNode>ans){
        if(node==null || d1==null)return false;
        if(node==d1){
         ans.add(node);
            return true ;
        }
        boolean flag=nodetorootpath(node.left,d1,ans) ||nodetorootpath(node.right,d1,ans);
      if(flag)ans.add(node);
        return flag;
    }
}