# Container With Most Water

Link to the problem [here](https://leetcode.com/problems/container-with-most-water/).

### [Solution] ()

```java
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
```

Time Complexity: ![O(n)](<https://latex.codecogs.com/svg.image?\inline&space;O(n)>), Space Complexity: ![O(1)](<https://latex.codecogs.com/svg.image?\inline&space;O(1)>)

Explanation: The algorithm aims to find the maximum area between two vertical lines in a given set of heights. It uses two pointers, one at the beginning and one at the end of the height array. 
It calculates the area between the pointers and keeps track of the maximum area encountered. The pointer associated with the shorter line is moved inwards,
as moving the longer line won't increase the area. This process is repeated until the pointers meet.
