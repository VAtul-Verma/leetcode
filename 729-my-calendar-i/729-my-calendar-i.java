class MyCalendar {
    List<int[]>arr;
    public MyCalendar() {
        arr=new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for(int []m:arr){
            if(m[0]<=start && start<m[1] || start<=m[0] && m[0]<end){
                return false;
            }
           
        }
         arr.add(new int[]{start,end});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */