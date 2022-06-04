/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)return "";
        LinkedList<TreeNode>q=new LinkedList<>();
        StringBuilder sb=new StringBuilder();
        q.addLast(root);
        while(q.size()!=0){
            TreeNode temp=q.removeFirst();
            sb.append((temp!=null?temp.val:"#")+" ");
            if(temp==null)continue;
            q.addLast(temp.left);
            q.addLast(temp.right);
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
       if(data.length()==0)return null;
        String []arr=data.split(" ");
         LinkedList<TreeNode>q=new LinkedList<>();
        TreeNode root=new TreeNode(Integer.parseInt(arr[0]));
        q.addLast(root);
        int idx=1;
        while(q.size()!=0){
            TreeNode rnode=q.removeFirst();
           if(!arr[idx].equals("#")){
                TreeNode lchild=new TreeNode(Integer.parseInt(arr[idx]));
                rnode.left=lchild;
                q.addLast(lchild);
            }
            idx++;
             if(!arr[idx].equals("#")){
                TreeNode rchild=new TreeNode(Integer.parseInt(arr[idx]));
                rnode.right=rchild;
                q.addLast(rchild);
            }
            idx++;
        }
        return root;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));