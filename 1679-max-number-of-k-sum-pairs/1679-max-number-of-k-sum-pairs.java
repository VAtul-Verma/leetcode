class Solution {
    public int maxOperations(int[] nums, int k) {
       HashMap<Integer,Integer>map=new HashMap<>();
        int cnt=0;
       for(int i:nums){
           map.put(i,map.getOrDefault(i,0)+1);    //store the nums and its cnt
           
       }
        for(int i:map.keySet()){
            if(map.containsKey(i)  && map.containsKey(k-i)){
                if(i!=k-i){
                    cnt+=Math.min(map.get(i),map.get(k-i)) ;
                    map.put(i,0);
                    map.put(k-i,0);
                }else{
                    cnt+=Math.floor(map.get(i)/2);
                    map.put(i,0);
                }
            }
        }
        return cnt;
        }
    
}
//  public int maxOperations(int[] nums, int k) {
//         Arrays.sort(nums);
//             int i=0;
//         int j=nums.length-1;
//         int cnt=0;
//         while(i<j){
//             if(nums[i]+nums[j]==k){  //if sum is equal to k increase cnt  ,i and decrease j;
//                 cnt++;
               
//                 i++;
//                 j--;
                
//             }else if(nums[i]+nums[j]<k){  //if sum is less than k increase i;
//                 i++;
//             }else if(nums[i]+nums[j]>k)//if sum is less than k decrease j;
//                 j--;
//             }
//         return cnt;
//         }
    
      
    
