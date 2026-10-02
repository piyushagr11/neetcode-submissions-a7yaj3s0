class Solution {
    
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> tempratureStack = new Stack<>();
        int[] result = new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            while(!tempratureStack.empty() && tempratureStack.peek()[0]<=temperatures[i]){
                tempratureStack.pop();
            }
            
            if(!tempratureStack.empty() && tempratureStack.peek()[0]>temperatures[i]){
                result[i]=tempratureStack.peek()[1]-i;
            }
            else{
                result[i]=0;
            }
            tempratureStack.push(new int[]{temperatures[i],i});
            
        }
        return result;
    }
}
