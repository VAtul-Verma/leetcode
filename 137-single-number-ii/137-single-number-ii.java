class Solution {
    public int singleNumber(int[] nums) {
        int tn=-1;
        int tn1=0;
        int tn2=0;
        for(int val:nums){
            int  commonbitwithtn=tn&val;
            int commonbitwithtn1=tn1&val;
            int commonbitwithtn2=tn2&val;
            
            tn=tn &~commonbitwithtn;
            tn1=tn1|commonbitwithtn;
            
            tn1=tn1 &~commonbitwithtn1;
            tn2=tn2|commonbitwithtn1;
            
            tn2=tn2 & ~commonbitwithtn2;
            tn=tn|commonbitwithtn2;
        }
        return tn1;
    }
}