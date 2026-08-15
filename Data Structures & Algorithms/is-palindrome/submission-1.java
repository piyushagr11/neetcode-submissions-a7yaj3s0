class Solution {
    public boolean isPalindrome(String s) {
        char[] sCharArray = s.toLowerCase().toCharArray();
        StringBuilder normalized = new StringBuilder();
        for (char c : sCharArray) {
            if (c >= 'a' && c <= 'z' || c>='0' && c<='9') {
                normalized.append(c);
            }
        }
        int first=0;
        int last=normalized.length()-1;
        
        while(last>first){
            if(normalized.charAt(first) != normalized.charAt(last)){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}
