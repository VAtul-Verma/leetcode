class Solution {
    public int countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j) && (i - j <= 2 || dp[i-1][j+1])) {
                    dp[i][j] = true;
                }
                if (dp[i][j]) {
                    result = result + 1;
                }
            }

        }        
        return result;
    }
}