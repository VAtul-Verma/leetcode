class Solution {
    public void mergesort(int []arr,int left,int right){
        if(left>=right){
            return;
        }
        int mid=left+(right-left)/2;
        mergesort(arr,left,mid);
        mergesort(arr,mid+1,right);
        merge(arr,left,mid,mid+1,right);
        
    }
    public void merge(int []arr,int a1l,int a1r,int a2l,int a2r){
        int totl=(a1r-a1l+1)+(a2r-a2l+1);
        int []res=new int[totl];
        
        int ptr1=a1l;int ptr2=a2l;int ptr3=0;
        while(ptr1<=a1r && ptr2<=a2r){
            if(arr[ptr1]<=arr[ptr2]){
                res[ptr3]=arr[ptr1];
                ptr3++;
                ptr1++;
            }else{
                res[ptr3]=arr[ptr2];
                ptr2++;
                ptr3++;
            }
        }
        while(ptr1<=a1r){
              res[ptr3]=arr[ptr1];
                ptr3++;
                ptr1++;
        }
        while(ptr2<=a2r){
             res[ptr3]=arr[ptr2];
                ptr2++;
                ptr3++;
        }
        for(int i=a1l;i<=a2r;i++){
            arr[i]=res[i-a1l];
        }
    }
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
    }
}