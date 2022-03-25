class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for (String sentence: sentences) {
            int currentCount = numberWords(sentence);
            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
        }
        
        return maxCount;
    }
    
    private int numberWords(String sentence) {
        int count = 0;
        for (int i = 1; i < sentence.length() - 1; i++) {
            if (sentence.charAt(i) == ' ') {
                count++;
            }
        }
        
        return count + 1;
    }
}