// { Driver Code Starts
import java.util.*;
import java.io.*;
class Node
{
    int data; 
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

class GFG
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node root = null;
            int inorder[] = new int[n];
            int preorder[] = new int[n];
            for(int i = 0; i < n; i++)
              inorder[i] = sc.nextInt();
              
            for(int i = 0; i < n; i++)
              preorder[i] = sc.nextInt();
              
            Solution ob = new Solution();
            root = ob.buildTree(inorder, preorder, n);
            postOrdrer(root);
            System.out.println();
        }
    }
    
    public static void postOrdrer(Node root)
    {
        if(root == null)
          return;
          
        postOrdrer(root.left);
        postOrdrer(root.right);
        System.out.print(root.data + " ");
    }
}// } Driver Code Ends


class Solution
{
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        // code here 
        
        return   buildTreehelper(preorder,0,n-1,inorder,0,n-1);
    }
    
     public static Node buildTreehelper(int[] preorder,int psi,int pei, int[] inorder,int isi,int iei) {
                if(isi>iei){
                    return null;
                }       
         Node node=new Node(preorder[psi]);
         int idx=0;
         while(inorder[idx]!=preorder[psi])idx++;
         int totlelem=idx-isi;
         node.left=buildTreehelper(preorder,psi+1,psi+totlelem,inorder,isi,idx-1);
        node.right=buildTreehelper(preorder,psi+1+totlelem,pei,inorder,idx+1,iei);
         return node;
    }
}
