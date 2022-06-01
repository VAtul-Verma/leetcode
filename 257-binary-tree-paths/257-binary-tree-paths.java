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
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String>fans=new ArrayList<>();
        if(root==null){
           return  fans;
        }
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>temp=new ArrayList<>();
        roottoleavpath(root,ans,temp);
        for(ArrayList<Integer>l:ans){
         
           String s=makestring(l);
            fans.add(s);
            
        }
        return fans;
    }
    public String makestring(ArrayList<Integer>ans){
          StringBuffer s=new StringBuffer();
        for(int i=0;i<ans.size()-1;i++){
            int val=ans.get(i);
            s.append(val+"->");
        }
        s.append(ans.get(ans.size()-1));
        return s.toString();
    }
     public void roottoleavpath(TreeNode root,ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>temp){
         if(root==null)return ;
        if(root.left==null && root.right==null){
            ArrayList<Integer>smallans=new ArrayList<>(temp);
            smallans.add(root.val);
            ans.add(smallans);
            return;
        }
        temp.add(root.val);
       roottoleavpath(root.left,ans,temp);
        roottoleavpath(root.right,ans,temp);
        temp.remove(temp.size()-1);
    }
    
}