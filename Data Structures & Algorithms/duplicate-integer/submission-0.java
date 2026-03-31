class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> a = new HashSet<>();
        for (int num : nums) {
            a.add(num);
        }
        return a.size() != nums.length;
    }
}