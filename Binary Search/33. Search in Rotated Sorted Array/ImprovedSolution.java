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
