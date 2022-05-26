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
        ArrayList<TreeNode>ans=new ArrayList<>();
        List<Integer>fans=new ArrayList<>();
        nodetorootpath(root,target,ans);
        for(int i=0;i<ans.size();i++){
            kleveldown(ans.get(i),k-i,i>0?ans.get(i-1):null,fans);
        }
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
    public boolean nodetorootpath(TreeNode root,TreeNode di,ArrayList<TreeNode>ans){
        if(root==null){
            return false;
        }
        if(root==di){
            ans.add(root);
            return true;
        }
      boolean left= nodetorootpath(root.left,di,ans);
        boolean right=nodetorootpath(root.right,di,ans);
        if(left || right){
            ans.add(root);
        }
        return left|| right;
    }
}