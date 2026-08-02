class Solution {
    public int rob(int[] nums) {
        int first=nums[0];
        if(nums.length==1){
            return first;
        }
        int second=Math.max(nums[0], nums[1]);
        for(int i=2;i<nums.length;i++){
            int temp = Math.max(second,nums[i]+first);
            first=second;
            second=temp;
        }
        return Math.max(first,second);
    }
}
