class Solution {
    public int strangePrinter(String s) {
        if (s == null || s.length() == 0) return 0;
        int len = s.length();
        int[] prevIndexes = new int[len]; //the index of previous appearence of charAt(i);
        Arrays.fill(prevIndexes, -1);
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<len; i++){
           char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                if(map.get(ch)==i-1) prevIndexes[i] = prevIndexes[i-1]; //no need to check continuous same chars
                else prevIndexes[i] = map.get(ch);
            } 
            map.put(ch, i);
        }
        
        int[][] dp = new int[len+1][len]; //length, start Index
        Arrays.fill(dp[1], 1); //always print once for length=1 substring
        for (int i = 2; i<=len; i++){ //length
            for (int j = 0; j<len; j++){ //start position
                int end = j+i-1;
                if(end >= len) break;
                if(s.charAt(end) == s.charAt(end-1)) dp[i][j] = dp[i-1][j]; //print the last char together with the previous char
                else {
                    dp[i][j] = dp[i-1][j]+1; //print the last char
                    int prevIdx = prevIndexes[end]; // previous appearance of the last char
                    while (prevIdx >=j) { //Important: has to check all previous appearance of the last char
                        int prefixLen = prevIdx+1-j;
                        dp[i][j] = Math.min(dp[i][j], dp[prefixLen][j]+dp[i-1-prefixLen][prevIdx+1]);//print the last char together with previous appearance
                        prevIdx = prevIndexes[prevIdx];
                    }
                }
            }
        }
        return dp[len][0];
    }
}