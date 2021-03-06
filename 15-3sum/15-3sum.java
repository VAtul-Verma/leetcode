class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || nums[i]!=nums[i-1]){
                int l=i+1,r=nums.length-1,sum=0;
                while(l<r){
                    if(nums[i]+nums[l]+nums[r]==0){
                        ArrayList<Integer>sans=new ArrayList<>();
                        sans.add(nums[i]);
                        sans.add(nums[l]);
                        sans.add(nums[r]);
                        ans.add(sans);
                        while(l<r && nums[l]==nums[l+1])l++;
                        while(l<r && nums[r]==nums[r-1])r--;
                        l++;
                        r--;
                    }
                    else if(nums[i]+nums[l]+nums[r]>0)r--;
                    else{
                        l++;
                    }
                }
            }
        }
        return ans;
    }
}