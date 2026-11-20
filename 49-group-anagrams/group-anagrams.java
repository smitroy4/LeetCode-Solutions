class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){                   //eat
            char[] chars = s.toCharArray();     //e,a,t
            Arrays.sort(chars);                 //a,e,t

            String key = new String(chars);     //aet

            map.putIfAbsent(key, new ArrayList<>());   //aet,[]

            map.get(key).add(s);                //aet -> eat,tea,ate
        }

        return new ArrayList<>(map.values());

    }
}