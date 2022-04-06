class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int num1=Integer.MIN_VALUE;
        int num2=Integer.MIN_VALUE;;
        int cnt1=0;
        int  cnt2=0;
        for(int i:nums){
            if(i==num1)cnt1++;
            else if(i==num2)cnt2++;
            else if(cnt1==0){
                num1=i;
                cnt1=1;
            }else if(cnt2==0){
                num2=i;
                cnt2=1;
            }else {
                cnt1--;
                cnt2--;
            }
        }
        List<Integer>ans=new ArrayList<>();
        cnt1=0;
        cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num1){
                cnt1++;
            }else if(nums[i]==num2){
                cnt2++;
            }
        }
        if(cnt1>nums.length/3)ans.add(num1);
        if(cnt2>nums.length/3)ans.add(num2);
        return ans;
        
    }
}