class Solution {
    public int specialArray(int[] nums) {
    int []cnt=new int[1001];
        for(int val:nums){
            cnt[val]++;
        }
        int total=nums.length;
        for(int i=0;i<1001;i++){
            if(i==total){
                return i;
            }
            total=total-cnt[i];
        }
        return -1;
    }
    
}