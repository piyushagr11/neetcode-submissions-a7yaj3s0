class Solution {
    public int rob(int[] nums) {
        int first=0;
        int second=0;
        for(int i=0;i<nums.length;i++){
            int temp = Math.max(second,nums[i]+first);
            first=second;
            second=temp;
        }
        return second;


    }
}