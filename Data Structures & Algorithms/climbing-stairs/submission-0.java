class Solution {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        int firstStair= 1;
        int secondStair=2;
        for(int i=3;i<n+1;i++){
            int temp=firstStair+secondStair;
            firstStair=secondStair;
            secondStair=temp;
        }
        return secondStair;
    }
}
