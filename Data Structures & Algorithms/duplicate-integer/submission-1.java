class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> a = new HashSet<>();
        for (int num : nums) {
            if(!a.add(num)){
                return true;
            }
        }
        return false;
    }
}