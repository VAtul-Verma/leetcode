class Solution {
    public int subarraysDivByK(int[] arr, int k) {
        
        int ans=0;
        int sum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(sum,1);
        for(long val:arr){
            sum+=val;
            int rem=(sum%k+k)%k;
            if(map.containsKey(rem)){
              
                ans+=map.get(rem);
                map.put(rem,map.get(rem)+1);
            }else{
                map.put(rem,1);
            }
           
        }
        return ans;
    }
}