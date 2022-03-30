class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        int left=0;
       int right=n-1;
       int maxleft=0;
       int maxright=0;
       int ans=0;
        
       while(left<=right){
           if(arr[left]<=arr[right]){
               if(arr[left]>=maxleft)maxleft=arr[left];
               else ans+=maxleft-arr[left];
               left++;
           }else{
               if(arr[right]>=maxright)maxright=arr[right];
               else ans+=maxright-arr[right];
               right--;
           }
       }
            return ans;
    }
}