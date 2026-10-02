class Solution {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        int num = 0;
        for(int i = 1; i < nums.length; i++){

            if(nums[num]==nums[i]){
                return true;
            }
            num++;
        }
        
        return false;
    }
}