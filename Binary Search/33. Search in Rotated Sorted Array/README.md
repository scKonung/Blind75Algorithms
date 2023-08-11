# Search in Rotated Sorted Array
Link to the problem [here](https://leetcode.com/problems/search-in-rotated-sorted-array/).

### [Basic Solution](/Binary%20Search/33.%20Search%20in%20Rotated%20Sorted%20Array/BasicSolution.java)

```java
class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0)
        return -1;
        int pivot = 0;
        //find the pivot
        for (int i = 1; i <= nums.length/2;i++){
            System.out.println(i);
            if (nums[i] <  nums[i-1]){
                pivot = i;
                break;
            }
            else if (nums[nums.length - i] <  nums[nums.length -1 - i]){
                pivot = nums.length - i;
                
                break;
            }
        }

        int l = 0;
        int r = nums.length -1;
        if (target > nums[r])
            r = pivot;
        else
            l = pivot;
        while (l < r){
            int index = (r-l)/2  + l;
            if ( nums[index] == target)
            return index;
            else  if ( nums[index +1] == target)
            return index + 1;
            if ( target > nums[index]){
                l = index + 1;
            } else{
                r = index;
            }
        }

        if (l == r){
            return nums[r] == target ? l : -1;
        }
        return -1;
    }
}
```

### [Improved Solution](/Binary%20Search/33.%20Search%20in%20Rotated%20Sorted%20Array/ImprovedSolution.java)

```java
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;//left index
        int right = nums.length -1;//rigth index
        while (left <= right){
            int middle = (left + right)/2;//middle index
            if (nums[middle] == target)//if middle equals to target, it's return a answer
            return middle;
            /*If number from left index is less then number from middle index,
            then we have an sorted part of array in the left side and we can check
            if the target in that part of array*/
             if (nums[left] <= nums[middle]){
                /*If target is between left and middle part, than
                we must search a target in this area, so we change right
                index to the middle - 1(-1 because we already check middle). Also
                if it/s not in this part of array, then it's in the another part, so 
                we must change left index to search in the right side'*/
                if (nums[left] <= target &&  target < nums[middle])
                right = middle -1;//put value to right index
                else
                left = middle + 1;//put value to the left index
            }
            else{
                //the same how in the another part
                if(nums[middle] < target && target <= nums[right])
                left = middle  + 1;//put value to left index
                else
                right = middle - 1;//put value to right index
            }
        }
        return -1;
    }
}
```

Time Complexity: ![O(log(n))](<https://latex.codecogs.com/svg.image?\inline&space;O(log(n))>), Space Complexity: ![O(1)](<https://latex.codecogs.com/svg.image?\inline&space;O(1)>)

Explanation: This algorithm is crafted to efficiently search for a target element within a rotated sorted array. 
It employs a binary search strategy, utilizing two pointers, `left` and `right`, to define the current search range. 
Within a `while` loop that persists while the `left` pointer is less than or equal to the `right` pointer:

1. Calculate the `middle` index as the average of the `left` and right indices.

2. Check if the element at the `middle` index matches the target. If it does, the `middle` index is returned as the solution.

3. When the segment between the `left` and `middle` indices is sorted:

- Inspect if the target falls within the range of this sorted segment between `left` and `middle`. If affirmative, refine 
the search to this segment by updating the right pointer to `middle - 1`. If negative, adjust the search to the other segment
by updating the `left` pointer to `middle + 1`.

4. Similarly, when the segment between the `middle` and right indices is sorted:

- Determine whether the target lies within the range of this sorted segment between `middle` and right. If true, narrow down 
the search to this segment by updating the `left` pointer to `middle + 1`. If false, transition the search to the opposite segment by updating the right pointer to `middle - 1`.

This iterative process continues, successively refining the search range based on comparisons between the target and array 
elements. Ultimately, the algorithm will either identify the target element and return its index or determine its absence and return -1.
