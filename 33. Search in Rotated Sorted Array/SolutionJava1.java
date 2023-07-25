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
