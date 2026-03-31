class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> wordMap = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        for(int i=0;i<strs.length;i++){
            String wordKey = Arrays.toString(convertWordToIntArray(strs[i]));
            wordMap.putIfAbsent(wordKey,new ArrayList<>());
            wordMap.get(wordKey).add(strs[i]);
        }

        wordMap.forEach((k,v) -> {
            ans.add(v);
        });
        return ans;
    }

    private int[] convertWordToIntArray(String str) {
        int[] intWord = new int[26];
        for(int i=0;i<str.length();i++){
            intWord[str.charAt(i) - 'a']++;
        }
        return intWord;
    }
}
