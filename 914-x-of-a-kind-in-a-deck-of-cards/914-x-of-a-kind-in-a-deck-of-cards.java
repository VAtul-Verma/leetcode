class Solution {
       public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < deck.length; i++)
            map.put(deck[i], map.getOrDefault(deck[i], 0) + 1);
        int ans = 0;
        for(int key : map.keySet())
            ans = gcd(ans, map.get(key));
        if(ans == 1)
            return false;
        return true;
    }
    
    public int gcd(int a, int b) {
		if(a == 0)
			return b;
		return gcd(b % a, a);
	}
}