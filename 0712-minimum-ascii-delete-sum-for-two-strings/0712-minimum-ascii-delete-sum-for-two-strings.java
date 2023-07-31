class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int[][] dp = new int[s1.length()][s2.length()];
        dp[0][0] = helper(s1.charAt(0), s2.charAt(0));
        for (int i = 1; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                dp[i][0] = Math.max(dp[i - 1][0], Integer.valueOf(s2.charAt(0)));
            } else {
                dp[i][0] = dp[i - 1][0];
            }
        }
        for (int i = 1; i < s2.length(); i++) {
            if (s1.charAt(0) == s2.charAt(i)) {
                dp[0][i] = Math.max(dp[0][i - 1], Integer.valueOf(s1.charAt(0)));
            } else {
                dp[0][i] = dp[0][i - 1];
            }
        }
        for (int i = 1; i < s1.length(); i++) {
            for (int j = 1; j < s2.length(); j++) {
                dp[i][j] = Math.max(dp[i - 1][j - 1] + helper(s1.charAt(i), s2.charAt(j)), Math.max(dp[i][j - 1], dp[i - 1][j]));
            }
        }
        int maxCommonSum = dp[s1.length() - 1][s2.length() - 1];
        return asciiSum(s1) + asciiSum(s2) - 2 * maxCommonSum;
    }

    private int asciiSum(String s) {
        int accumulator = 0;
        for (int i = 0; i < s.length(); i++) {
            accumulator = accumulator + s.charAt(i);
        }
        return accumulator;
    }


    private int helper(char a, char b) {
        if (a == b) {
            return Integer.valueOf(a);
        } else {
            return 0;
        }
    }
}