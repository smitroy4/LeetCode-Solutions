class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        //created hashmap to store string as keys and list of strings as values
        Map<String, List<String>> map = new HashMap<>(); 

        //to iterate over the string array
        for(String str : strs){
            
            //created array of string
            char[] charArray = str.toCharArray(); 
            
            //sorted the char array
            Arrays.sort(charArray); 
            
            //created a string to contain the elements of charArray as chars
            String sortedStr = new String(charArray);   
            
            //adding to map if absent - the strings(k) and bew arrayList(v)
            map.putIfAbsent(sortedStr, new ArrayList<>());  
            
            //get the strings(k) from map and add the iterating element
            map.get(sortedStr).add(str);    

        }

        //return new arrayList with maps' values only
        return new ArrayList<>(map.values());   
        
    }
}
