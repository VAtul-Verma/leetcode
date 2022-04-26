class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int tar) {
        Arrays.sort(arr);
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>smallans=new ArrayList<>();
        combinationh(arr,tar,0,ans,smallans);
        return ans;
        
    }
    public int combinationh(int []arr,int tar,int id,List<List<Integer>>ans,List<Integer>smallans){
        if(tar==0){
            List<Integer>base=new ArrayList<>(smallans);
            ans.add(base);
            return 1;
        }
        int cnt=0,prev=-1;
        for(int i=id;i<arr.length;i++){
            if(prev!=arr[i] && tar-arr[i]>=0){
                smallans.add(arr[i]);
                cnt+=combinationh(arr,tar-arr[i],i+1,ans,smallans);
                smallans.remove(smallans.size()-1);
                prev=arr[i];
            }
        }
        return cnt;
    }
}