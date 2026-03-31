class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] copyNums = nums.clone();
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;

        while(i<j){
            if(nums[i]+nums[j]==target){
              
                return checkCopy(nums[i],nums[j],copyNums);
            }
            if(nums[i]+nums[j]>target){
                j--;
            }
            else {
                i++;
            }
        }
        return null;
    }

    private int[] checkCopy(int num, int num1, int[] copyNums) {
        int[] ans = new int[2];
        int count=0;
        for(int i=0;i<copyNums.length;i++){
            if(copyNums[i] == num || copyNums[i] == num1){
                ans[count] = i;
                count++;
            }
        }
        return ans;
    }
}
