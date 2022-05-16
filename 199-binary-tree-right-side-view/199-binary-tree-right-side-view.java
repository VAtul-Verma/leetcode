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
    public List<Integer> rightSideView(TreeNode node) {
         if(node==null)return new ArrayList<>();
      ArrayList<Integer>ans=new ArrayList<>();
      Queue<TreeNode>q=new LinkedList<>();
      q.add(node);
      while(q.size()>0){
          int size=q.size();
          int cnt=1;
          int s=size;
          while(size-->0){
              TreeNode temp=q.poll();
              
               if(cnt==s){
                  ans.add(temp.val);
              }
              cnt++;
              if(temp.left!=null){
                  q.add(temp.left);
              }
               if(temp.right!=null){
                  q.add(temp.right);
              }
             
          }
      }
          
      return ans;
    }
}