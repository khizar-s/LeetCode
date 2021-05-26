class Solution {
    public boolean backspaceCompare(String s, String t) {
        int l1 = s.length() -1;
        int l2 = t.length() -1;
        
        while (l1 >= 0 || l2 >= 0) {
            int countS = 0;
            int countT = 0;
            
            while (l1 >= 0 && (countS > 0 || s.charAt(l1) == '#')) {
                if (s.charAt(l1) == '#') {
                    countS++;
                } else {
                    countS--;
                }
                l1--;
            }
            
            while (l2 >= 0 && (countT > 0 || t.charAt(l2) == '#')) {
                if (t.charAt(l2) == '#') {
                    countT++;
                } else {
                    countT--;
                }
                l2--;
            }
            
            if (l1 >= 0 && l2 >= 0) {
                if (s.charAt(l1) != t.charAt(l2)) {
                    return false;
                } else {
                    l1--;
                    l2--;
                }
            } else {
                if (l1 >= 0 || l2 >= 0) {
                    return false;
                }
            }
        }
        return true;
    }
}