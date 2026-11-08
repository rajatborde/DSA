class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;
        int l=0, r=height.length-1;
        int count=0;
        int currMax= Integer.MIN_VALUE;
        while(l<r){
            if(height[l] < height[r]){
                if(currMax<height[l])
                    currMax=height[l];
                count+=currMax-height[l];
                l++;
            }
            else{
                if(currMax<height[r])
                    currMax=height[r];
                count+=currMax-height[r];
                r--;
            }
        }
        return count;
    }
}