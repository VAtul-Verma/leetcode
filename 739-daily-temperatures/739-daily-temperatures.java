class Solution {
    public int[] dailyTemperatures(int[] nums) {
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            boolean flag=true;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                   nums[i]=(j-i);
                    flag=false;
                    break;
                }
            }
            if(flag==true){
               nums[i]=0;
            }
        }
      nums[nums.length-1]=0;
       
        return nums;
    }
}