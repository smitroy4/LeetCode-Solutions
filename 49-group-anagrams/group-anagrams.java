class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>  map = new HashMap<>();
        
        for(int i =0 ; i< strs.length; i++){
            char [] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            if(map.containsKey(key)){
                map.get(key).add(strs[i]);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(key,list);
            }
        }
        return new ArrayList<>(map.values());
    }
}