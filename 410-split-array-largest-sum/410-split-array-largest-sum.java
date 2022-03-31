class Solution {
    
    public int splitArray(int[] nums, int m) {
    int sum=0;
        int ans=0;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
        max=Math.max(max,i);
        sum+=i;
    }    
        
        int low=max;
        int high=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(ispossible(nums,mid,m)==true){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean ispossible(int []nums,int mid,int m){
        int currsum=0;
        int currarr=1;
        for(int i=0;i<nums.length;i++){
            if(currsum+nums[i]<=mid){
                currsum+=nums[i];
                
            }else{
                currarr++;
                currsum=nums[i];
            }
        }
        if(currarr>m)return false;
        return true;
    }
}