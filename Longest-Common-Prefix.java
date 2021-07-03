class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String first  = strs[0];
        Boolean end   = false;
        Boolean track = true;
        int index     = 0;
        String res    = "";
        
        while (true) {
            if (end == true) {
                return res;
            } else {
                for(String s : strs) {
                    if (s.length() == 0) {
                        return res;
                    }
                    if (index == s.length()-1) {
                        end = true;
                    }
                    if (s.charAt(index) != first.charAt(index)) {
                        track = false;
                    }
                }
                if (track == true) {
                    res += first.charAt(index);
                    index += 1;
                } else {
                    return res;
                }
            }
        }
    }
}