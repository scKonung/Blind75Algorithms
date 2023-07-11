class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] answer = new int[size];
        Arrays.fill(answer,1);
        int multiply = 1;
        //multiply an product of array from the begining
        for(int i =0; i < size; i++){
            answer[i] *= multiply;
            multiply *= nums[i];
        }
        multiply = 1;
        //multiply the product of array from the end
        for(int i = size -1; i >= 0; i--){
            answer[i] *= multiply;
            multiply *= nums[i];
        }
        return answer;
    }
}
