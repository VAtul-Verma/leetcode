class Solution {
   public boolean canArrange(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // fill the map with remainder vs its count
        for(int val : arr){
            int rem = val % k;
            if(rem < 0) rem += k;// handle -ve test case 
            
            map.put(rem , map.getOrDefault(rem, 0) + 1);
        }
        // this is just for checking hashTable
        // for(int val : map.keySet()){
        //     System.out.println(val + " " + map.get(val) + " ");
        // }
        
        for(int rem : map.keySet())            
            // case 1. if rem is ZERO
            // always even for Pair
            if(rem == 0){
                if(map.get(rem) % 2 != 0){
                    return false;
                }
            }
			// for equal number of Pair like (5,5)
			else if (k - rem == rem){// for Case k/2 i.e = 10/2 = 5
                // (5, 5) make it always even for making PIAR
                if(map.get(rem) % 2 != 0){
                    return false;
                }
            } 
        // (rem) == k-(rem) for pair
        // like 73 and 27 is divisible by 10
        // 73%10 = 3(rem) and 27%10 = 7(rem) , now 3 + 7 = 10 which is also divisible by k(10)
            else if(!map.get(rem).equals(map.getOrDefault(k - rem,0))){
                    return false;
            }
         return true;
    }
}