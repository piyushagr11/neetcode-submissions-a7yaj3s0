class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        if(sLength != t.length()){
            return false;
        }
        
        
        Map<Character,Integer> charMap = new HashMap<>();
        for (int i=0;i<sLength;i++){
            
            charMap.put(s.charAt(i),charMap.getOrDefault(s.charAt(i),0)+1);
        }
        
        for (int i=0;i<t.length();i++){
            if(charMap.getOrDefault(t.charAt(i),0)<1){
                return false;
            }
            charMap.put(t.charAt(i),charMap.get(t.charAt(i))-1);
        }
        return true;
    }
}
