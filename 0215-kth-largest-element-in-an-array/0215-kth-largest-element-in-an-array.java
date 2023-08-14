class Solution {
    int[] arr;
    public int findKthLargest(int[] nums, int k) {
        arr = nums;
        sort(0, arr.length - 1, nums.length - k);
        //for(int v : arr) System.out.print(v + " ");
        return arr[nums.length - k];
    }
    
    void sort(int s, int e, int k){
        if(s >= e) return;
        int i = s, j = e, pivot = arr[(s + e) / 2];
        while(i <= j){
            while(i <= e && arr[i] < pivot) i++;
            while(j >= s && arr[j] > pivot) j--;
            if(i <= j){
                int temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;
            }
        }
        if(k > j) sort(i, e, k);
        else sort(s, j, k);
    }
}