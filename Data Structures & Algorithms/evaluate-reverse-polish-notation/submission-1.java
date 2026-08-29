class Solution {
     public int evalRPN(String[] tokens) {
        Stack<Integer> numStack = new Stack<>();
        for(String token: tokens){
            if(!"+-*/".contains(token)){
                numStack.push(Integer.parseInt(token));
            }
            else {
                int val2 = numStack.pop();
                int val1 = numStack.pop();

                if(token.equalsIgnoreCase("+")){
                    numStack.push(val2+val1);
                } else if (token.equalsIgnoreCase("-")) {
                    numStack.push(val1-val2);
                } else if (token.equalsIgnoreCase("*")) {
                    numStack.push(val2*val1);
                }
                else {
                    numStack.push(val1/val2);
                }
            }
        }
        return numStack.pop();
    }
}
