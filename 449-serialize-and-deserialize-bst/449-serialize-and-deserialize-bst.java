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
        if(root==null)return;
         sb.append(root.val+" ");//here space is used which helps in deserialize
         serialize(root.left,sb);
         serialize(root.right,sb);
    }
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        serialize(root,sb);
        return sb.toString();
    }
    public TreeNode bstpre(int []pre,int lr,int rr,int []idx){
        int i=idx[0];
        if(i>=pre.length || pre[i]<lr || pre[i]>rr)return null;
        TreeNode root=new TreeNode(pre[i]);  //make root to current data
        idx[0]++;
        root.left=bstpre(pre,lr,root.val,idx);
        root.right=bstpre(pre,root.val,rr,idx);
        return root;
    }
    

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals(""))return null;
        String []st=data.split(" ");
        int []pre=new int[st.length];
        for(int i=0;i<st.length;i++){
            pre[i]=Integer.parseInt(st[i]);
        }
        int []idx=new int[1];
        return bstpre(pre,-(int)1e9,(int)1e9,idx);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;