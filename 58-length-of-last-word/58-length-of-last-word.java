class Solution {
    public int lengthOfLastWord(String str) {
         String[] arrOfStr = str.split(" ", -2);
        int i=arrOfStr.length-1;
        while(i>=0 && arrOfStr[i].length()==0){
            i--;
        }
        return arrOfStr[i].length();
    }
}