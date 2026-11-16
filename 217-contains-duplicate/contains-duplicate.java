class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(); //create new empty set

        for(int n : nums){      //put all the elements of arr to the new set
            set.add(n);
        }

        if(set.size() != nums.length){
            return true;
        }   //return whether the size of set != arr

        return false;
    }
}