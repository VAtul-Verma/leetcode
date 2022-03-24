class Solution {
    public List<List<Integer>> fourSum(int[] arr, int k) {
      int count=0;
        HashSet<ArrayList> set = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               
                int start = j+1;
                int end = arr.length-1;
                

                while(end>start){
                    int sum=arr[i]+arr[j]+arr[start]+arr[end];
                    if(sum==k){
                       	ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[start]);
                        temp.add(arr[end]);
                        set.add(temp);
                        start++;
                        end--;
                    }else if(sum>k){
                        end--;
                    }else if(sum<k){
                        start++;
                    }
                }
            }
        }
        for(ArrayList<Integer>al:set){
            ans.add(al);
        }
        return ans;
		
    }
}