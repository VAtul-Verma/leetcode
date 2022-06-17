class Solution {
    public int subarraysWithKDistinct(int[] arr, int k) {
        return atmostk(arr,k)-atmostk(arr,k-1);
    }
    public int atmostk(int []arr,int k){
         int []freq=new int[20000+1];
        int n=arr.length,si=0,ei=0,cnt=0,ans=0;
        while(ei<n){
           if(freq[arr[ei++]]++==0)cnt++;
            while(cnt>k){
                if(freq[arr[si++]]--==1)cnt--;
                
            }
            ans+=ei-si;
        }
        return ans;
    }
}