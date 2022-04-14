class Solution {
    public int countOdds(int low, int high) {
       int cnt=(high-low+1);
        if(cnt%2==0){
            return cnt/2;
        }else if(cnt%2==1){
            if(low%2==1 && high%2==1){
                return cnt/2 +1;
            }else return cnt/2;
        }
        return 0;
    }
}