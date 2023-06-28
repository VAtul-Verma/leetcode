class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        Map<String, Double> cost = new HashMap<>();
        int index = 0;
        for(int[] edge : edges){
            List<Integer> list1 = map.getOrDefault(edge[0], new ArrayList<>());
            List<Integer> list2 = map.getOrDefault(edge[1], new ArrayList<>());
            list1.add(edge[1]);
            map.putIfAbsent(edge[0], list1);
            list2.add(edge[0]);
            cost.put(edge[1] + "," + edge[0], succProb[index++]);
            map.putIfAbsent(edge[1], list2);
        }
        boolean[] visited = new boolean[n];
        Double[] dist = new Double[n];
        Arrays.fill(dist, -1.0);
        dist[start] = 1.0;
        for(int i = 0; i < n; i++){
            double max = -1.0;
            int max_index = -1; 
            for(int j = 0; j < n; j++){
                if(!visited[j] && dist[j] > max){
                    max = dist[j];
                    max_index = j;
                }
            }
            if(max_index == -1)
                break;
            visited[max_index] = true;
            List<Integer> list1 = map.getOrDefault(max_index, new ArrayList<>());
            for(int ni : list1){
                String key1 = max_index + "," + ni;
                String key2 = ni + "," + max_index;
                double p = cost.containsKey(key1) ? cost.get(key1) : 0.0;
                if(!cost.containsKey(key1) && cost.containsKey(key2)){
                    p = cost.get(key2);
                }
                if(!visited[ni] && dist[max_index] * p > dist[ni]){
                    dist[ni] = dist[max_index] * p;
                }
            }
        }
        return dist[end] == -1 ? 0.0 : dist[end];
    }
}