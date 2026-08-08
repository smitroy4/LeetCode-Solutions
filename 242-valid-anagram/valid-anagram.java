class Solution {
    public boolean isAnagram(String s, String t) {

        //first check!
        if(s.length() != t.length()){
            return false;
        }

        //created a int[]
        int count[] = new int[26];

        //lopped through the strings to count the character count
        for(int i = 0; i< s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // another loop to iterate over the count to check whether they're zero
        for(int val : count){
            if (val != 0){
                return false;
            }
        }

        // finally returned true
        return true;
        
    }
}