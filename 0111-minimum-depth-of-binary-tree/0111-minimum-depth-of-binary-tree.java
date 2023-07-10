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
    public int minDepth(TreeNode root) {
        
        if(root == null)
        {
            return 0;
        }
        
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        
        while(!queue.isEmpty())
        {
            
            int N = queue.size();
            depth++;
            while(N-- > 0)
            {
             TreeNode node = queue.poll();
                if(node.left == null && node.right == null)
                {
                    return depth;
                }
                if(node.left != null)
                {
                    queue.offer(node.left);
                }
                if(node.right != null)
                {
                    queue.offer(node.right);
                }
                
            }
            
        }
       return depth; 
    }
}
// DFS :

// class Solution {
//     public int minDepth(TreeNode root) {
//         if(root == null)
//         {
//             return 0;
//         }
//        return solve(root); 
//     }
    
    
//     private int solve(TreeNode root){
        
//         if(root == null)
//         {
//             return 0;
//         }
        
//         if(root.left == null || root.right == null)
//         {
//             return solve(root.left) + solve(root.right) + 1;
//         }
        
//         int left = solve(root.left);
//         int right = solve(root.right);
        
//         return Math.min(left , right) + 1;
//     }
    
// }