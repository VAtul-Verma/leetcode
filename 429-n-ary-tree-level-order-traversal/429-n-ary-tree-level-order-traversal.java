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
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node>p=new ArrayDeque<>();
         // Queue<Node>cp=new ArrayDequeu<>();
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null)return ans;
      
      p.add(root);
       
        while(p.size()>0){
            List<Integer>sans=new ArrayList<Integer>();
           int size=p.size();
         
             for(int i =0;i<size;i++){
                Node ele = p.remove();//an element is taken out from queue
                sans.add(ele.val);//that element added to arraylist declared just above two line
                for(Node child :ele.children){//that element is used as to iterate and all its children are added to queue
                    p.add(child);
                }
            }
            ans.add(sans);
            
        }
        return ans;
       
    }
}