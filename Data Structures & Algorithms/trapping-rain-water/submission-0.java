class Solution {
     public int trap(int[] height) {
        int first=0;
        int last = height.length-1;
        int res=0;

        int maxFirstFound=height[first];
        int maxLastFound=height[last];
        while(first<last){
            
            if(height[first]<height[last]){
                first++;
                res+=Math.max(maxFirstFound-height[first],0);
                maxFirstFound= Math.max(maxFirstFound,height[first]);
            }
            else{
                last--;
                res+=Math.max(maxLastFound-height[last],0);
                maxLastFound=Math.max(maxLastFound,height[last]);
            }
        }
        return res;

    }
}
