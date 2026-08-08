class Solution {
    public boolean isAnagram(String s, String t) {

        //first check!
        if(s.length() != t.length()){
            return false;
        }

        //creation of 2 hashmaps to get the chars and number of occurences in the string
        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        //lopping through the string to put all the chars and ints into the hashmap
        for(int i =0; i < s.length(); i++){
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }

        //final check
        return countS.equals(countT);
        
    }
}