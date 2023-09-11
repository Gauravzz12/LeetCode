package Arrays_Strings_Hashing;
import java.util.*;

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> es = new HashSet<>();
        
        for (String e: emails) {
            es.add(strip(e));
        }
        return es.size();
    }
    public String strip(String e) {
        int i = 0;
        StringBuilder res = new StringBuilder();
        
        while (i < e.length()) {
            char c = e.charAt(i);
            if (c == '+') {
                i = e.indexOf('@');
                continue;
            } else if (c == '@') {
                res.append(e.substring(i));
                return res.toString();
            } else if (c != '.')
                res.append(c);
            i++;
        }
        return res.toString();
    }
}