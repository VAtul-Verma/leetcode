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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
         List<List<Integer>>ans=new ArrayList<>();
        Queue<TreeNode>q=new ArrayDeque<>();
        if(root==null)return ans;
        q.add(root);
        int cnt=0;
        while(q.size()!=0){
            List<Integer>temp=new ArrayList<>();
            int size=q.size();
            while(size-->0){
            TreeNode p=q.poll();
                temp.add(p.val);
            
               if(p.left!=null){
                   q.add(p.left);
               }
                 if(p.right!=null){
                   q.add(p.right);
               }
                
            }
            if(cnt%2==1){
                Collections.reverse(temp);
            }
            cnt++;
            ans.add(temp);
        }
        return ans;
    }
}