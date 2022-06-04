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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int n=preorder.length;
        return  constructFromPrePost(preorder,0,n-1,postorder,0,n-1);
    }
    public TreeNode constructFromPrePost(int[] preorder,int psi,int pei, int[] postorder,int ppsi,int ppei) {
        if(psi>pei)return null;
        TreeNode root=new TreeNode(preorder[psi]);
        if(psi==pei)return root;
        int id=ppsi;
        while(postorder[id]!=preorder[psi+1]){
            id++;
        }
        int tele=id-ppsi+1;
        root.left=constructFromPrePost(preorder,psi+1,psi+tele,postorder,ppsi,ppsi+tele-1);
        root.right=constructFromPrePost(preorder,psi+tele+1,pei,postorder,ppsi+tele,ppei-1);
        return root;
    }
}