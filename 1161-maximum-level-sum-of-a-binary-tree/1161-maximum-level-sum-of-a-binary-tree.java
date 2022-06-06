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
    public int maxLevelSum(TreeNode root) {
        if(root==null)return 0;
        LinkedList<TreeNode> que = new LinkedList<>();
        que.addLast(root);
        int level=1;
        int msum=Integer.MIN_VALUE;
        int mylevel=1;

        while (que.size() != 0) {
            int size = que.size();
          int currsum=0;
           
            while (size-- > 0) {
               
                TreeNode p = que.removeFirst();
                currsum+=p.val;
               
              
               
            
                if (p.left != null)
                    que.addLast(p.left);
                if (p.right != null)
                    que.addLast(p.right);
            
            }
             if(currsum>msum){
                    msum=currsum;
                  
                    mylevel=level;
                }
            
            level++;
        }
        // for(List<Integer>a:ans){
        //     Collections.sort(a);
        // }

        return mylevel;
    }
}