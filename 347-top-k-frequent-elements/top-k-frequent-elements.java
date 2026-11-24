
import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        ArrayList<Integer> l=new ArrayList<>(map.keySet());
        Collections.sort(l,(a,b)->map.get(b)-map.get(a));

        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=l.get(i);
        }
        return ans;
    }
}
