class Solution {
    public int[] dailyTemperatures(int[] nums) {
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            boolean flag=true;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    ans.add(j-i);
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                ans.add(0);
            }
        }
        ans.add(0);
        int []fans=new int[ans.size()];
        int j=0;
        for(int i:ans){
            fans[j++]=i;
        }
        return fans;
    }
}