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
    int camera=0;
    public int minCameraCover(TreeNode root) {
        if(root==null)return 0;
        if(minCameraCoverhelper(root)==-1){  //root itself need camera
            camera++;
        }
        return camera;
    }
     public int minCameraCoverhelper(TreeNode root) {
        if(root==null)return 1;//no required camera;
         int lc=minCameraCoverhelper(root.left);
         int rc=minCameraCoverhelper(root.right);
         if(lc ==-1 || rc==-1){
             camera++;
             return 0;
         }
         if(lc==0 || rc==0){  //if already has camera then 
             return 1;  //return to our parents that does not required camrea
         }
         return -1;
    }
}