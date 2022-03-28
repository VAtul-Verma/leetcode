class Solution {
    public void nextPermutation(int[] arr) {
        if(arr==null || arr.length==1)return ;
        int i=arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        if(i>=0){
            int j=arr.length-1;
            while(arr[j]<=arr[i]){
                j--;
            }
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
        reverse(arr,i+1,arr.length-1);
    }
    public void reverse(int []arr,int l,int r){
        while(l<=r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}