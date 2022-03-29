class RandomizedCollection {
    
    HashMap<Integer, HashSet<Integer>> map;
    ArrayList<Integer> list;
    Random rand;

    public RandomizedCollection() {
        map = new HashMap<>();
        list = new ArrayList<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        list.add(val);
        int lidx = list.size() - 1;
        
        if(map.containsKey(val)){
            HashSet<Integer> set = map.get(val);
            set.add(lidx);
            
            return false;
        } else {
            HashSet<Integer> set = new HashSet<>();
            set.add(lidx);
            map.put(val, set);
            
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val) == false){
            return false; 
        }
        
        int lidx = list.size() - 1;
        int lval = list.get(lidx);
        int vidx = map.get(val).iterator().next();
        
        list.set(lidx, val);
        list.set(vidx, lval);
        
        list.remove(lidx);
        
        map.get(val).remove(vidx);
        if(map.get(val).size() == 0){
            map.remove(val);
        }
        
        if(map.containsKey(lval)){
            map.get(lval).remove(lidx);
            map.get(lval).add(vidx);
        }
        return true;
    }
    
    public int getRandom() {
        int idx = rand.nextInt(list.size());
        return list.get(idx);
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */