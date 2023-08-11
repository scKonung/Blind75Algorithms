# 3Sum

Link to the problem [here](https://leetcode.com/problems/3sum).

### [Solution](/Array/15.%203Sum/Solution.java)

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for ( int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}
```

Time Complexity: ![O(n^2)](<https://latex.codecogs.com/svg.image?\inline&space;O(n^2)>), Space Complexity: ![O(n)](<https://latex.codecogs.com/svg.image?\inline&space;O(n)>)

Explanation: The goal of this algorithm is to identify unique sets of three numbers in a sorted array that sum up to zero.
By iterating through the array, it uses two pointers, `j` and `k`, which start at indices adjacent to the current element. It calculates 
the sum of the current element, `nums[i]`, and the elements at the pointers. If the sum is zero, the triplet is added to the result. The 
pointers then move inwards, skipping duplicates to prevent repetition. The process continues for each element.
