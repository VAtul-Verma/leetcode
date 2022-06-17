class Solution {
    public int subarraysWithKDistinct(int[] arr, int k) {
        return atmostk(arr,k)-atmostk(arr,k-1);
    }
    public int atmostk(int []arr,int k){
         HashMap<Integer,Integer>freq=new HashMap<>();
        int n=arr.length,si=0,ei=0,cnt=0;
        while(ei<n){
            freq.put(arr[ei],freq.getOrDefault(arr[ei],0)+1);
            ei++;
            while(freq.size()>k){
                freq.put(arr[si],freq.get(arr[si])-1);
                if(freq.get(arr[si])==0){
                    freq.remove(arr[si]);
                }
                si++;
            }
            cnt+=ei-si;
        }
        return cnt;
    }
}