# Two sum

Link to the problem [here](https://leetcode.com/problems/two-sum/).

### [Basic Solution](/Array/1.%20Two%20Sum/BasicSolution.java) : Brute Force

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

Time Complexity: ![O(n^2)](<https://latex.codecogs.com/svg.image?\inline&space;O(n^2)>), Space Complexity: ![O(1)](<https://latex.codecogs.com/svg.image?\inline&space;O(1)>)

Explanation: Simply iterate the array and find the target value among the array in each iteration.
