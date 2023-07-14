class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        int res=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(arr[0],1);
        for(int i=1;i<arr.length;i++){
            int ans=map.getOrDefault(arr[i]-difference,0)+1;
            map.put(arr[i],ans);
            res=Math.max(ans,res);
        }
        return res;
    }
}