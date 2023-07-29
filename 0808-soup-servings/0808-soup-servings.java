class Solution {
    public double soupServings(int N) {
        HashMap<String, double[]> map = new HashMap<>(); //store intermediate result for optimization
        if (N >= 5600) return 1.0;
        double[] res = dfs(N, N, map);
        return res[0] + 0.5 * res[1];
    }
    
    public double[] dfs (int A, int B, HashMap<String, double[]> map) {
        if (A <= 0 && B <= 0) return new double[]{0, 1, 0};
        if (A <= 0 && B > 0) return new double[]{1, 0, 0};
        if (A > 0 && B <= 0) return new double[]{0, 0, 1};
        String key = A + "#" + B;
        if (map.containsKey(key)) return map.get(key);
        double res[] = {0, 0, 0};
        double[] res_1 = dfs(A - 25, B - 75, map);
        double[] res_2 = dfs(A - 50, B - 50, map);
        double[] res_3 = dfs(A - 75, B - 25, map);
        double[] res_4 = dfs(A - 100, B, map);
        for (int i = 0; i < 3; ++i) {
            res[i] = 0.25 * (res_1[i] + res_2[i] + res_3[i] + res_4[i]);
        }
        map.put(key, res);
        return res;
    }
}