package Arrays_Strings_Hashing;

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String s:strs){
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
             String str = new String(arr);
            if(!map.containsKey(str)){
                map.put(str,new ArrayList<>());
            }
            map.get(str).add(s);
        }
        return new ArrayList<>(map.values());
         
    }
}