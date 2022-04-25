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
    public List<List<Integer>> levelOrder(TreeNode root) {
       
        ArrayDeque<TreeNode>pq=new ArrayDeque<>();
        ArrayDeque<TreeNode>cq=new ArrayDeque<>();
        List<List<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>sans=new ArrayList<>();
         if(root==null){
            return ans;
        }
        pq.add(root);
        while(pq.size()>0){
        
            TreeNode temp=pq.remove();
    
                sans.add(temp.val);
            if(temp.left!=null){
                cq.add(temp.left);
            }if(temp.right!=null){
                cq.add(temp.right);
            }
              // ans.add(sans);
            if(pq.size()==0){
                    ans.add(sans);
                pq=cq;
                cq=new ArrayDeque<>();
                sans=new ArrayList<Integer>();
            }
                   }
        return ans;
    }
}