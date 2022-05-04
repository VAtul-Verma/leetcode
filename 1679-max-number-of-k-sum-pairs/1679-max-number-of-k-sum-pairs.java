class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
            int i=0;
        int j=nums.length-1;
        int cnt=0;
        while(i<j){
            if(nums[i]+nums[j]==k){  //if sum is equal to k increase cnt  ,i and decrease j;
                cnt++;
               
                i++;
                j--;
                
            }else if(nums[i]+nums[j]<k){  //if sum is less than k increase i;
                i++;
            }else if(nums[i]+nums[j]>k)//if sum is less than k decrease j;
                j--;
            }
        return cnt;
        }
    
}
      
    
