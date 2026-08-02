class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int step1=0;
        int step2=0;


        for(int i=2;i<cost.length+1;i++){
            int temp=Math.min(cost[i-1]+step2,cost[i-2]+step1);
            step1=step2;
            step2=temp;
        }

        return step2;
    }
}
