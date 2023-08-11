class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int maxArea = 0;

        while ( left < right){
            int heightMin = Math.min(height[left],height[right]);
            int width = right - left;
            int area = heightMin * width;
            if (area > maxArea)
            maxArea = area;
            if (height[left] > height[right])
            right--;
            else
            left++;
        }

        return maxArea;
    }
}
