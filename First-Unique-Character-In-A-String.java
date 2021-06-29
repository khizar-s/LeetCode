class Solution {
    public int firstUniqChar(String s) {
        
        char[] arr = s.toCharArray();
        int[]  occ = new int[26];
        
        for (char c : arr) {
            occ[c-'a']++;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (occ[arr[i]-'a'] == 1) {
                return i;
            }
        }
                
        return -1;        
        
    }
}