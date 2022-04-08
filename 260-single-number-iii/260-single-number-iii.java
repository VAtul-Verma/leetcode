class Solution {
    public int[] singleNumber(int[] nums) {
        int res=0;
        for(int val:nums){
            res=res^val;
        }
        int rmsb=(res & -res);
        int seta=0;
        int setb=0;
        for(int val:nums){
            if((val & rmsb)==0){
                seta=seta^val;
            }else{
                setb=setb^val;
            }
        }
        int []ans=new int[2];
        ans[0]=seta;
        ans[1]=setb;
        return ans;
    }
}