class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int res = 0;
        Map<Integer,Integer[]> numMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int minFound = nums[i];
            int maxFound=nums[i];
            if(numMap.containsKey(nums[i]-1)){
                minFound = Integer.min(numMap.get(nums[i]-1)[0],minFound);
                maxFound = Integer.max(numMap.get(nums[i]-1)[1],maxFound);
            }
            if(numMap.containsKey(nums[i]+1)){
                minFound = Integer.min(numMap.get(nums[i]+1)[0],minFound);
                maxFound = Integer.max(numMap.get(nums[i]+1)[1],maxFound);
            }
            numMap.put(nums[i],new Integer[]{minFound,maxFound});

            if(numMap.containsKey(minFound)){
                numMap.put(minFound,new Integer[]{minFound,maxFound});
            }
            if(numMap.containsKey(maxFound)){
                numMap.put(maxFound,new Integer[]{minFound,maxFound});
            }


            res = Math.max(res,maxFound-minFound);

        }

        return res+1;
    }

}
