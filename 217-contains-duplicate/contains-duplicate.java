class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seenElm = new HashSet<>();

        for(int num : nums){
            if(seenElm.contains(num)){
                return true;
            }
            seenElm.add(num);
        }
        return false;
    }
}