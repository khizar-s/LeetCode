import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> sStack = new Stack<Character>();
        Stack<Character> tStack = new Stack<Character>();
        
        for (char c: S.toCharArray()) {
            if (c != '#') {
                sStack.push(c);
            } else if (!sStack.isEmpty()) {
                sStack.pop();
            }
        }
        
        for (char c: T.toCharArray()) {
            if (c != '#') {
                tStack.push(c);
            } else if (!tStack.isEmpty()) {
                tStack.pop();
            }
        }
        
        if (sStack.size() != tStack.size()) {
            return false;
        }
        
        int l = sStack.size();
        
        for (int i = 0; i < l; i++) {
            char s = sStack.pop();
            char t = tStack.pop();
            if (s != t) {
                return false;
            }
        }
        
        return true;                   
    }
}