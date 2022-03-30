class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
       int clsum=nums[0]+nums[1]+nums[n-1];
       
        for(int i=0;i<=n-2;i++){         //n-2 --because we need atleast 1 pair of 3 number
            int st=i+1;
            int end=n-1;
            while(st<end){
                int currsum=nums[i]+nums[st]+nums[end];
                if(currsum<target){
                    st++;
                }else if(currsum>target){
                    end--;
                }else if(currsum==target){
                    return currsum;
                }
                
                if(Math.abs(currsum-target)<Math.abs(clsum-target)){
                    clsum=currsum;
                }
            }
            
        }
        return clsum;
    }
}