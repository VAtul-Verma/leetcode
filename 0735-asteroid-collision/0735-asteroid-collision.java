class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<Integer>();
        
        for (int as : asteroids) {
            if (as > 0 || stack.isEmpty() || stack.peek() < 0) {
                stack.push(as);
            }          
            else {
                boolean negWin = false;
                while (!stack.isEmpty() && stack.peek() > 0) {
                    int sum = stack.peek() + as;
                    if (sum > 0) {
                        negWin = false;
                        break;
                    }
                    else if (sum == 0) {
                        stack.pop();
                        negWin = false;
                        break;
                    }
                    else {
                        stack.pop();
                        negWin = true;
                    }
                }
                if (negWin) {
                    stack.push(as);
                }
            }
        }
        
        int[] res = new int[stack.size()];
        int index = res.length - 1;
        while (!stack.isEmpty()) {
            res[index--] = stack.pop();
        }
        return res;
    }
}