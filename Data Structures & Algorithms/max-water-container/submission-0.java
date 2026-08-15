class Solution {
    public int maxArea(int[] heights) {
        int first= 0;
        int last =heights.length-1;
        int res= 0;
        while(last>first){
            res= Math.max(Math.min(heights[last],heights[first])*(last-first) , res);
            if(heights[last]>heights[first]){
                int oldFirst= heights[first];
                while(heights[first]<=oldFirst && first<last){
                    first++;
                }
            }
            else{
                int oldLast = heights[last];
                while(heights[last]<=oldLast && first<last){
                    last--;
                }
            }
        }
        
        return res;
    }
}
