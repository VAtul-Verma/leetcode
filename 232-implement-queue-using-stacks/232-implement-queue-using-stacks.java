class MyQueue {
Stack<Integer>input;
    Stack<Integer>output;
    
    public MyQueue() {
    input=new Stack<Integer>();
        output=new Stack<>();
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        if(output.empty()==false){
            return output.pop();
        }
        while(input.empty()==false){
            output.push(input.pop());
        }
        return output.pop();
    }
    
    public int peek() {
          if(output.empty()==false){
            return output.peek();
        }
        while(input.empty()==false){
            output.push(input.pop());
        }
        return output.peek();
    }
    
    public boolean empty() {
        if(input.empty()  && output.empty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */