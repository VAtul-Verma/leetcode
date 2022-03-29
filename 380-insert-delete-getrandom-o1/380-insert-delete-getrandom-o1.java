class RandomizedSet {
        Random r;
        HashMap<Integer,Integer>map;
        ArrayList<Integer>list;
    public RandomizedSet() {
        r=new Random();
        map=new HashMap<>();
        list=new ArrayList<>();
        
    }
    
    public boolean insert(int val) {
       if(map.containsKey(val)){
           return false;
       }
        list.add(val);
        map.put(val,list.size()-1);
        
        return true;
    }
    
    public boolean remove(int val) {
          if(!map.containsKey(val)){
           return false;
       }
        int validx=map.get(val);
        int lastvalidx=list.size()-1;
        int lastval=list.get(lastvalidx);
        list.set(validx,lastval);
        list.set(lastvalidx,val);
        map.put(val,lastvalidx);
        map.put(lastval,validx);
        list.remove(list.size()-1);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        int idx=r.nextInt(list.size());
        return list.get(idx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */