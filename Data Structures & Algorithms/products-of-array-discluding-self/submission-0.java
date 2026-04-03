class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] increasing = new int[nums.length];
        int[] decreasing = new int[nums.length];
        int[] result = new int[nums.length];
        increasing[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            
            increasing[i] = increasing[i-1]*nums[i];
        }
        decreasing[nums.length-1]=nums[nums.length-1];
        for(int j=nums.length-2;j>=0;j--){
            decreasing[j] = decreasing[j+1]*nums[j];
        }

        result[0] = decreasing[1];
        result[nums.length-1] = increasing[nums.length-2];
        for(int i=1;i<nums.length-1;i++){
            result[i] = increasing[i-1]*decreasing[i+1];
        }

        return result;

    }
}  
