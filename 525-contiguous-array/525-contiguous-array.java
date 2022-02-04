class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer>counts=new HashMap<>();
        counts.put(0,-1);
        int mlen=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                cnt--;
            }else{
                cnt++;
            }
            if(counts.containsKey(cnt)){
                mlen=Math.max(mlen,i-counts.get(cnt));
            }else{
                counts.put(cnt,i);
            }
        }
        return mlen;
    }
}