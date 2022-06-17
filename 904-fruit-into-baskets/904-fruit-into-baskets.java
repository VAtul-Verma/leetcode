class Solution {
    public int totalFruit(int[] arr) {
        int n=arr.length,si=0,ei=0,len=0,cnt=0;
        int freq[]=new int[40000+1];
        while(ei<n){
            if(freq[arr[ei++]]++==0)cnt++;
            while(cnt>2){
                if(freq[arr[si++]]--==1)cnt--;
                
            }
            len=Math.max(len,ei-si);
        }
        return len;
    }
}