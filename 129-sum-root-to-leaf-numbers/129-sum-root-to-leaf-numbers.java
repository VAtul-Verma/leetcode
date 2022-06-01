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
    public int sumNumbers(TreeNode root) {
        
        int sum=0;
         ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>temp=new ArrayList<>();
        roottoleavpath(root,ans,temp);
        for(ArrayList<Integer>l:ans){
            Collections.reverse(l);
            int num=makenumber(l);
            sum+=num;
        }
        return sum;
        
    }
    public int makenumber(ArrayList<Integer>ans){
        int num=0;
        int cnt=1;
        for(int i=0;i<ans.size();i++){
            num+=ans.get(i)*cnt;
            cnt*=10;
        }
        return num;
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