class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean []vis=new boolean[nums.length];
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>smallans=new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,0,vis,ans,smallans);
        return ans;
    }
    public void helper(int []nums,int cnt,boolean []vis,List<List<Integer>>ans,List<Integer>smallans){
        if(cnt==nums.length){
            List<Integer>base=new ArrayList<>(smallans);
            ans.add(base);
            return ;
        }
        int prenum=(int)-1e8;
        for(int i=0;i<nums.length;i++){
            if(!vis[i]  && prenum!=nums[i]){
                vis[i]=true;
                smallans.add(nums[i]);
                helper(nums,cnt+1,vis,ans,smallans);
                vis[i]=false;
                smallans.remove(smallans.size()-1);
                prenum=nums[i];
            }
        }
    }
    
}