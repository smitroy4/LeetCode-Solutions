class Solution {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        int idx = 0;

        for(int i = 1; i<nums.length; i++){
            if(nums[idx++]==nums[i]){
                return true;
            }
        }

        return false;

    }
}