class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int com = target - nums[i];
            if (seen.containsKey(com)) {
                return new int[]{seen.get(com), i};
            }
            seen.put(nums[i], i);
        }
        return new int[]{};
        
    }
}