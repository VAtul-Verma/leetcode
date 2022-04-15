class Solution {
    public int arraySign(int[] nums) {
        int  mcnt=0;
        int pcnt=0;
     for(int i=0;i<nums.length;i++){
         if(nums[i]<0){
            mcnt++;
         }else if(nums[i]==0){
             return 0;
         }else{
             pcnt++;
         }
     }   
        return mcnt%2==0?1:-1;
    }
}