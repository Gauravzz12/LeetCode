package Arrays_Strings_Hashing;
class Solution {
    public boolean isSubsequence(String s, String t) {
        int S=s.length();
        int T=t.length();
        int i=0,j=0;
        if(S<1)
        return true;
        if(S>T || T<1)
        return false;
        while(i<T){
            if(s.charAt(j)==t.charAt(i))
            j++;
            i++;
            if(j==S)
            return true;
        }
        return false;
    }
}