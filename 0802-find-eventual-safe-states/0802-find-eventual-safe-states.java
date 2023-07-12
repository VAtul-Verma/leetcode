// DFS - Beats 98%
class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {

        boolean[] vis = new boolean[graph.length];
        boolean[] isSafe = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                dfs(graph,i,vis,isSafe);
            }
        }

        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<isSafe.length;i++){
            if(isSafe[i]){
                ans.add(i);
            }
        }
        return ans;
    }

    private boolean dfs(int[][] graph,int curr,boolean[] vis,boolean[] isSafe){
        if(isSafe[curr] || graph[curr].length==0){
            return isSafe[curr] = true;
        }
        if(vis[curr]){
            return false;
        }
        vis[curr]=true;
        boolean res = true;
        for(int x:graph[curr]){
            res = res&&dfs(graph,x,vis,isSafe);
        }
        return isSafe[curr] = res;
    } 
}
// BFS - Beats 55%
// class Solution {
//     public List<Integer> eventualSafeNodes(int[][] graph) {
//         Queue<Integer> queue = new ArrayDeque<>();
        
//         ArrayList<Integer>[] a = new ArrayList[graph.length];

//         for(int i=0;i<a.length;i++){
//             a[i] = new ArrayList<>();
//         }

//         int[] outDegree = new int[graph.length];
//         int i=0;
//         for(int[] x:graph){
//             for(int y:x){
//                 a[y].add(i);
//             }
//             outDegree[i] = x.length;
//             if(x.length==0){
//                 queue.add(i);
//             }
//             i++;
//         }

//         boolean[] isSafe = new boolean[a.length];
//         ArrayList<Integer> ans = new ArrayList<>();

//         while(!queue.isEmpty()){
//             int curr = queue.remove();
//             isSafe[curr] = true;
//             for(int x:a[curr]){
//                 if(--outDegree[x]==0){
//                     queue.add(x);
//                 }
//             }
//         }
 
//         for(i=0;i<a.length;i++){
//             if(isSafe[i]){
//                 ans.add(i);
//             }
//         }
//         return ans;   
//     }
// }