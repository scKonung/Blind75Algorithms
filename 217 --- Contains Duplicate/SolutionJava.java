class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> show = new HashSet<>();
        for (int num : nums){
            if (show.contains(num))
            return true;
            show.add(num);
        }
        return false;
    }
}
