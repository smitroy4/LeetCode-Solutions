class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> numSet = new HashSet<>();

        for(int num : nums){
            numSet.add(num);
        }

        if(numSet.size()==nums.length){
            return false;
        }
        
        return true;
        
    }
}