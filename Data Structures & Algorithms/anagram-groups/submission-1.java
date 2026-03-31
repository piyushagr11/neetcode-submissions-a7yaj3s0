class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> wordMap = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String wordKey = Arrays.toString(convertWordToIntArray(strs[i]));
            wordMap.putIfAbsent(wordKey,new ArrayList<>());
            wordMap.get(wordKey).add(strs[i]);
        }
        return new ArrayList<>(wordMap.values());
    }

    private int[] convertWordToIntArray(String str) {
        int[] intWord = new int[26];
        for(int i=0;i<str.length();i++){
            intWord[str.charAt(i) - 'a']++;
        }
        return intWord;
    }
}
