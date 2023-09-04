class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while(left < right){
            int width = right - left;
            int heights = height[left] < height[right] ? height[left] : height[right];
            max = heights * width > max ? heights * width : max;
            if(height[left] < height[right]){
                left++;
            } else if(height[right] < height[left]){
                right--;
            } else{
                left++;
                right--;
            }
        }
        return max;
    }
}