class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                int num2 = (int) stk.pop();
                int num1 = (int) stk.pop();
                
                int newNo = eval(num1, num2, tokens[i]);
                
                stk.push(newNo);
            }
            else
                stk.push(Integer.parseInt(tokens[i]));
        }
        
        
        return stk.pop();
    }
    
    
    public int eval(int num1, int num2, String token){
        
        int result = 0;
        switch(token){
            case "+":{
                result = num1+num2;
                break;
            }
                
            case "-":{
                result = num1-num2;
                break;
            }
            
            case "*":{
                result = num1*num2;
                break;
            }
            case "/":{
                result = num1/num2;
                break;
            }
        }
        
        return result;
    }
}