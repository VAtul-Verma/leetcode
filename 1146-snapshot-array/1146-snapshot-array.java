class SnapshotArray {
private Map<Integer,Integer>[]snaparr;
    
    private Integer snapid;
    public SnapshotArray(int length) {
        snapid=0;
        snaparr=new HashMap[length];
        for(int i=0;i<length;i++){
            snaparr[i]=new HashMap<>();
        }
    }
    
    public void set(int index, int val) {
        snaparr[index].put(snapid,val);
    }
    
    public int snap() {
        return snapid++;
    }
    
    public int get(int index, int snap_id) {
        while(snap_id>=0){
            if(snaparr[index].containsKey(snap_id)){
            return snaparr[index].get(snap_id);
            }
            snap_id--;
        }
        return 0;
    
    }
    
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */