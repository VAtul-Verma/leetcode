//Graph Coloring - DFS
//0==no color
//1=blue
//-1=red color
// class Solution {
//     public boolean isBipartite(int[][] g) {
//         int[] colors = new int[g.length];
//         for (int i = 0; i < g.length; i++)
//             if (colors[i] == 0 && !validColor(g, colors, 1, i))
//                 return false;
//         return true;
//     }

//     boolean validColor(int[][] g, int[] colors, int color, int node) {
//         if (colors[node] != 0)
//             return colors[node] == color;
//         colors[node] = color;
//         for (int adjacent : g[node])
//             if (!validColor(g, colors, -color, adjacent))
//                 return false;
//         return true;
//     }
    
// }



//Graph Coloring - BFS

// class Solution {
//     public boolean isBipartite(int[][] g) {
//         int[] colors = new int[g.length];
//         for (int i = 0; i < g.length; i++)
//             if (colors[i] == 0) {
//                 Queue<Integer> q = new LinkedList<>();
//                 q.add(i);
//                 colors[i] = 1;
//                 while (!q.isEmpty()) {
//                     Integer node = q.poll();
//                     for (int adjacent : g[node])
//                         if (colors[adjacent] == colors[node])
//                             return false;
//                         else if (colors[adjacent] == 0) {
//                             q.add(adjacent);
//                             colors[adjacent] = -colors[node];
//                         }
//                 }
//             }
//         return true;
//     }
// }

//Union Find 

class Solution {
    int[] parent; 
    public boolean isBipartite(int[][] graph) {
        parent = new int[graph.length];
        for(int i = 0; i < parent.length; i++) parent[i]  = i;
        for (int i=0; i<graph.length; i++) {
            int[] adjs = graph[i];
            for (int j=0; j<adjs.length; j++) {
                if (find(i) ==find(adjs[j])) return false;
                union(adjs[0], adjs[j]);
            }
        }
        return true;
    }
    
     int find(int i) {
            if (parent[i] == i) {
                return parent[i];
            }
            parent[i] = find(parent[i]);
            return parent[i];
        }
        
        void union(int i, int j) {
            int parentI = find(i);
            int parentJ = find(j);
            if (parentI != parentJ) {
                parent[parentI] = parentJ;
            }
        }
}

