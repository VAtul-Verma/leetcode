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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        return   buildTreehelper(preorder,0,n-1,inorder,0,n-1);
    }
     public TreeNode buildTreehelper(int[] preorder,int psi,int pei, int[] inorder,int isi,int iei) {
                if(isi>iei){
                    return null;
                }       
         TreeNode node=new TreeNode(preorder[psi]);
         int idx=0;
         while(inorder[idx]!=preorder[psi])idx++;
         int totlelem=idx-isi;
         node.left=buildTreehelper(preorder,psi+1,psi+totlelem,inorder,isi,idx-1);
        node.right=buildTreehelper(preorder,psi+1+totlelem,pei,inorder,idx+1,iei);
         return node;
    }
}