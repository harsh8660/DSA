class Solution {
    public int maxArea(int[] height) {
        int max_area=0;
        int i=0;
        int j=height.length-1;
        while(i<j)
        {
            int h=Math.min(height[i],height[j]);
            max_area=Math.max(max_area,h*(j-i));
            if(height[i]<height[j])
            i++;
            else
            j--;
        }
        return max_area;
    }
}
