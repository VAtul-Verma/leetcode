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
    int NodeToNodeMaxPathSum = -(int) 1e9;
    public  int max(int... arr) {
        int max = arr[0];
        for (int ele : arr)
            max = Math.max(max, ele);

        return max;
    }

   

    public  int maxPathSum_(TreeNode root) {
        if (root == null)
            return 0;

        int lrtn = maxPathSum_(root.left); // left root To Node
        int rrtn = maxPathSum_(root.right); // right root To Node

        int rootToNode = Math.max(lrtn, rrtn) + root.val;
        NodeToNodeMaxPathSum = max(NodeToNodeMaxPathSum, rootToNode, root.val, lrtn + root.val + rrtn);

        return max(rootToNode,root.val);
    }

    public  int maxPathSum(TreeNode root) {
        maxPathSum_(root);
        return NodeToNodeMaxPathSum;
    }
}