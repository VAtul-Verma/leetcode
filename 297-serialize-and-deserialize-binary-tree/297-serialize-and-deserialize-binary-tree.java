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
     public void serialize(TreeNode root,StringBuilder sb) {
        if(root==null){
            sb.append("# ");
            return ;
        }
         sb.append(root.val+" ");
         serialize(root.left,sb);
         serialize(root.right,sb);
         
    }

    public String serialize(TreeNode root) {
        if(root==null)return "";
        StringBuilder sb=new StringBuilder();
        serialize(root,sb);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
     public TreeNode deserialize(String [] data,int []idx) {
         int i=idx[0];
        if(i>=data.length || data[i].equals("#")){
            idx[0]++;
            return null;
        }
         
         TreeNode root=new TreeNode(Integer.parseInt(data[idx[0]]));
         idx[0]++;
         root.left=deserialize(data,idx);
         root.right=deserialize(data,idx);
         return root;
    }

    public TreeNode deserialize(String data) {
        if(data.length()==0)return null;
        int []idx=new int[1];
        String []arr=data.split(" ");
        return deserialize(arr,idx);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));