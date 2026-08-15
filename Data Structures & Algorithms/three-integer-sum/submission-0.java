class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=1;
        int k=nums.length-1;
        Set<List<Integer>> resSet = new HashSet<>();
        while(i<k-1){
            while(j<k){
                if(nums[i]+nums[j]+nums[k] == 0){
                    resSet.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(nums[i]+nums[j]+nums[k] > 0){
                    k--;
                }
                else{
                    j++;
                }
            }
            i++;
            j=i+1;
            k=nums.length-1;
        }
        
        return new ArrayList<>(resSet);
    }
}
