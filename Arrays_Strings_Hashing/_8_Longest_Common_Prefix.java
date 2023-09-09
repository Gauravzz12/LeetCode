package Arrays_Strings_Hashing;

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
       int n=strs.length;
       Arrays.sort(strs);
       String start=strs[0];
       String end=strs[n-1];
      StringBuilder ans = new StringBuilder();
       for(int i=0;i<(Math.min(start.length(),end.length()));i++){
           if(start.charAt(i)!=end.charAt(i)){
               return ans.toString();
           }
           ans.append(start.charAt(i));
       }
       return ans.toString();
    }
}