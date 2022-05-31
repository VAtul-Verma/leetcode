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
        Lca(root,p,q);
        return LCA;
    }
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         ArrayList<TreeNode>ans=new ArrayList<>();
//         ArrayList<TreeNode>ans2=new ArrayList<>();
//         nodetorootpath(root,p,ans);
//          nodetorootpath(root,q,ans2);
//         int i=ans.size()-1;
//         int j=ans2.size()-1;
//         while(i>=0 && j>=0){
//             if(ans.get(i)!=ans2.get(j))break;
//             i--;
//             j--;
//         }
//         return ans.get(i+1);
        
        
//     }
    TreeNode LCA=null;
    public boolean Lca(TreeNode root,TreeNode p,TreeNode q){
        if(root==null)return false;
        boolean self=(root==p || root==q);
        boolean left=Lca(root.left,p,q);
        if(LCA!=null)return true;
        boolean right=Lca(root.right,p,q);
        if(LCA!=null)return true;
        if((left && right)|| (left && self)||(right && self)){
            LCA=root;
        }
        return left || right|| self;
    }
//     public static boolean nodetorootpath(TreeNode root,TreeNode p,ArrayList<TreeNode>ans){
//         if(root==null)return false ;
//         if(root==p){
//             ans.add(root);
//             return true;
            
//         }
//       boolean left=  nodetorootpath(root.left,p,ans);
//         boolean right=nodetorootpath(root.right,p,ans);
//         if(left || right){
//             ans.add(root);
//         }
//         return left || right;
        
//     }
}