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
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         if(root==null || root==p || root==q){
//             return root;
//         }
//         TreeNode left=lowestCommonAncestor(root.left,p,q);
//         TreeNode right=lowestCommonAncestor(root.right,p,q);
//         if(left==null){   //always retur not null node
//             return right;
//         }else if(right==null)return left;
//         else{//if both are not null value the we found lca;
//             return root;
            
//         }
//     }
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root==null)return null;
            TreeNode curr=root;
            TreeNode lca=null;
            while(curr!=null){
                if(curr.val<p.val && curr.val<q.val){
                    curr=curr.right;
                }else  if(curr.val>p.val && curr.val>q.val){
                    curr=curr.left;
                }else{
                    lca=curr;
                    break;
                }
            }
            return lca;
        }
}