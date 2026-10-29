class Solution {
    public boolean containsDuplicate(int[] nums) {

        boolean answer = 
            Arrays.stream(nums)
                                .distinct()
                                .count() < nums.length;
        return answer;
        
    }
}