//{ Driver Code Starts
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t-- > 0){
	            String input[] = br.readLine().trim().split(" ");
                int a = Integer.parseInt(input[0]);
                int b = Integer.parseInt(input[1]);
	            String s = br.readLine();
    	    	Node root = buildTree(s);
                Solution g = new Solution();
                Node k = g.lca(root,a,b);
    			System.out.println(k.data);
    	        
	        }
	}
}

// } Driver Code Ends


/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class Solution
{
    //Function to return the lowest common ancestor in a Binary Tree.
	Node lca(Node root, int n1,int n2)
	{
	    Node ans=LCA(root,n1 ,n2);
	    return ans;
	}
	
     public Node lowestCommonAncestor(Node root, int p, int q) {
        ArrayList<Node>ans=new ArrayList<>();
        ArrayList<Node>ans2=new ArrayList<>();
        nodetorootpath(root,p,ans);
         nodetorootpath(root,q,ans2);
        int i=ans.size()-1;
        int j=ans2.size()-1;
        while(i>=0 && j>=0){
            if(ans.get(i)!=ans2.get(j))break;
            i--;
            j--;
        }
        return ans.get(i+1);
        
        
    }
     public static boolean nodetorootpath(Node root,int p,ArrayList<Node>ans){
        if(root==null)return false ;
        if(root.data==p){
            ans.add(root);
            return true;
            
        }
      boolean left=  nodetorootpath(root.left,p,ans);
        boolean right=nodetorootpath(root.right,p,ans);
        if(left || right){
            ans.add(root);
        }
        return left || right;
        
    }
    
    //effective approach
     Node LCA(Node root,int n1,int n2){
        if(root==null)return null;
        if(root.data==n1 || root.data==n2)return root;
        Node left=LCA(root.left,n1,n2);
        Node right=LCA(root.right,n1,n2);
        if(left!=null && right!=null)return root;
        if(left!=null)return left;
        else{
            return right;
        }
    }

}

