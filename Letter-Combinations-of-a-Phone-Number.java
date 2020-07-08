class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        if (digits.length() == 0 || digits == null) {
            return result;
        }
        
        String[] mapping = {
            "0",
            "1",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        
        recursiveFunction(result, mapping, 0, "", digits);
        return result;
    }
    
    public void recursiveFunction(List<String> result, String[] mapping, int index, String current, String digits) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        
        String letters = mapping[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            recursiveFunction(result, mapping, index + 1, current + letters.charAt(i), digits);
        }
    }
}