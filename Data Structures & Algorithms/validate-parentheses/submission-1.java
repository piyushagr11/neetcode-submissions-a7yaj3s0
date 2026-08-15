class Solution {
    public boolean isValid(String s) {
        Stack<Character> parantheses = new Stack<>();
        char[] sc = s.toCharArray();
        for(char c: sc){
            if (c == '(' || c == '{' || c=='['){
                parantheses.push(c);
                continue;
            }
            if(parantheses.isEmpty()){
                return false;
            }
            char fetch = parantheses.pop();
            if(fetch == '(' && c != ')' ){
                return false;
            }
            if(fetch == '{' && c != '}' ){
                return false;
            }
            if(fetch == '[' && c != ']' ){
                return false;
            }
            

        }
        return parantheses.isEmpty();
    }
}
