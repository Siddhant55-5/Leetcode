class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;

        for (int i = 0; i < height.length; i++) {
                int width = right-left;
                int h = Math.min(height[right], height[left]);
                int area = width * h;

                maxArea = Math.max(maxArea, area);
            
            if (height[left]>height[right]){
                right--;
            }else{
                left++;
            }
            
        }

        return maxArea;
    }
}