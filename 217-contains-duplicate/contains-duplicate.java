class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> numSet = new HashSet<>();

        for(int i : nums){
            numSet.add(i);
        }

        if(nums.length == numSet.size()){
            return false;
        }

        return true;
        
    }
}