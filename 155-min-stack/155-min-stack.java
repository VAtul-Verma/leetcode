class MinStack {
  Stack<Integer> data;
        Stack<Integer> min;
    public MinStack() {
         data=new Stack<>();
        min=new Stack<>();
        min.push(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        data.push(val);
        min.push(Math.min(min.peek(),val));
    }
    
    public void pop() {
        if(data.size()==0){
            return ;
        }
        
        min.pop();
         data.pop();
        
    }
    
    public int top() {
         if(data.size()==0){
            return 0;
        }
        return data.peek();
    }
    
    public int getMin() {
         if(data.size()==0){
            return 0;
        }
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */