/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
      if(root==null){
            List<Integer>base=new ArrayList<>();
            return base;
        }
         List<Integer>ans=new ArrayList<>();
        postorderTraversalhelper(root,ans);
        ans.add(root.val);
        return ans;
        
    }
    public static void postorderTraversalhelper(Node root, List<Integer>ans){
        if(root==null){
            return ;
        }
        for(Node child:root.children){
        postorderTraversalhelper(child,ans);
         
       
         ans.add(child.val);
    }  
        
    }
}