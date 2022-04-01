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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=inorder.length;
       return  buildTree(postorder,0,n-1,inorder,0,n-1);
    }
    
     public TreeNode buildTree(int[] postorder,int psi,int pei ,int[] inorder,int isi,int iei) {
        if(isi>iei){
            return null;
        }
         int id=isi;
         while(inorder[id]!=postorder[pei]){
             id++;
             
         }
         int totlele=id-isi;
         TreeNode node=new TreeNode(postorder[pei]);
         node.left=buildTree(postorder,psi,psi+totlele-1,inorder,isi,id-1);
        node.right=buildTree(postorder,psi+totlele,pei-1,inorder,id+1,iei);
         return node;
         
    }
}