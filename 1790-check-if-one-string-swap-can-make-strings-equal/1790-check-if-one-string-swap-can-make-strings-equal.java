class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
         int firstDiffIndex = 0;
        int countDiff = 0;
        for(int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if(countDiff > 0 && 
                   (s1.charAt(firstDiffIndex) != s2.charAt(i) || s2.charAt(firstDiffIndex) != s1.charAt(i)))
                    return false;
                countDiff++;
                firstDiffIndex = i;
                if (countDiff > 2) return false;
            }
        }
        return (countDiff == 1)? false : true;
    }
}