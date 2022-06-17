class Solution {
    public int numberOfSubarrays(int[] arr, int k) {
        return atmostkodd(arr,k)-atmostkodd(arr,k-1);
    }
    public int atmostkodd(int []arr,int k){
       
        int n=arr.length,si=0,ei=0,cnt=0,ans=0;
        while(ei<n){
          if(arr[ei++]%2==1)cnt++;
        
            while(cnt>k){
                if(arr[si++]%2==1)cnt--;
                
            }
            ans+=ei-si;
        }
        return ans;
    }
} 