class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int pidx=0;
        int nidx=1;
        int []res=new int[n];
        for(int val:nums){
            if(val>=0){
                res[pidx]=val;
                pidx+=2;
            }else{
                res[nidx]=val;
                nidx+=2;
            }
        }
        return res;
    }
}