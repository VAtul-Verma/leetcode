class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       
        // write your code here
        if(s.length()<p.length()){
            return new ArrayList<>();
        }
        
        int[] map2 = new int[26];
        for(int i = 0; i < p.length(); i++){
            char ch = p.charAt(i);
            map2[ch - 'a']++;
        }
        
        int[] map1 = new int[26];
        for(int i = 0; i < p.length(); i++){
            char ch = s.charAt(i);
            map1[ch - 'a']++;
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        if(areAnagram(map1, map2) == true){
            res.add(0);
        }
        
        int i = p.length();
        int j = 0;
        
        while(i < s.length()){
            char chi = s.charAt(i);
            map1[chi - 'a']++;
            
            char chj = s.charAt(j);
            map1[chj - 'a']--;
            
            if(areAnagram(map1, map2) == true){
                res.add(j + 1);
            }
            
            i++;
            j++;
        }
        
       return res;
        
	
    }public static boolean areAnagram(int[] map1, int[] map2){
	    for(int i = 0; i < 26; i++){
	        if(map1[i] != map2[i]){
	            return false;
	        }
	    }
	    
	    return true;
	}
    }
