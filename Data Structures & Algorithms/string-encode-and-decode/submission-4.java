class Solution {

    int[] strLength;
    public String encode(List<String> strs) {
        StringBuilder result= new StringBuilder();
        strLength = new int[strs.size()];
        for(int i=0;i<strs.size();i++){
            strLength[i] = strs.get(i).length();
            result.append(strs.get(i));
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> result=new ArrayList<>();
        int start=0;
        for(int i=0;i<strLength.length;i++){
            
            result.add(str.substring(start,start+strLength[i]));
            start += strLength[i];
        }

        return result;
    }
}
