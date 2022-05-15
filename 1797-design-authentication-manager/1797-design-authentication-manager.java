class AuthenticationManager {
    Map<String, Integer> unExpired;
    int timeToLive;
    public AuthenticationManager(int timeToLive) {
        unExpired = new HashMap<>();
        this.timeToLive = timeToLive;
    }
    
    public void generate(String tokenId, int currentTime) {
        unExpired.put(tokenId, currentTime+timeToLive);
    }
    
    public void renew(String tokenId, int currentTime) {
        if(unExpired.containsKey(tokenId) &&  unExpired.get(tokenId)>currentTime)
            unExpired.replace(tokenId, currentTime+timeToLive);
    }
    
    public int countUnexpiredTokens(int currentTime) {
        int count = 0;
        for(Map.Entry<String, Integer> e:unExpired.entrySet()){
            if(e.getValue() > currentTime)
                count++;
        }
        return count;
    }
}

/**
 * Your AuthenticationManager object will be instantiated and called as such:
 * AuthenticationManager obj = new AuthenticationManager(timeToLive);
 * obj.generate(tokenId,currentTime);
 * obj.renew(tokenId,currentTime);
 * int param_3 = obj.countUnexpiredTokens(currentTime);
 */