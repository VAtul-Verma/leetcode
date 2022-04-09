class Solution {
    public int specialArray(int[] nums) {
     for(int i=1;i<1001;i++){
         int cnt=0;
         for(int val:nums){
             if(val>=i){
                 cnt++;
             }
         }
         if(cnt==i){
                 return i;
             }
     }   
        return -1;
    }
}