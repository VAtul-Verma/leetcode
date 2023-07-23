class Solution {
    Map<Integer,List<TreeNode>> cache = new HashMap<>();
    
    public List<TreeNode> allPossibleFBT(int N) {
        List<TreeNode> res = new ArrayList<TreeNode>();
        if (N == 1) {
            res.add(new TreeNode(0));
            return res; 
        }
        if (N % 2 == 0) return res;
        if (cache.containsKey(N)) return cache.get(N);     
            
        for (int i = 1; i < N; i+= 2) {
            List<TreeNode> rres = allPossibleFBT(N - i - 1);
            for (TreeNode ln : allPossibleFBT(i)) {
                for (TreeNode rn : rres) {
                    TreeNode root = new TreeNode(0);
                    root.left = ln;
                    root.right = rn;
                    res.add(root);
                }
            }
        }
        cache.put(N, res);
        return res;
    }
}