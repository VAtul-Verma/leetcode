class Solution {
    public int search(int[] a, int target) {
        int s=0;
        int end=a.length-1;
        while(s<=end){
            int mid=(end+s)/2;
            if(a[mid]<target){
                s=mid+1;
            }else if(a[mid]>target){
                end=mid-1;
            }else if(a[mid]==target){
                return  mid;
            }
        
            
        }
        return -1;
    }
}