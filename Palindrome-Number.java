class Solution {
    public boolean isPalindrome(int x) {
        int org = x;
        int num = 0;
        if (x < 0) {
            return false;
        }
        while (x > 0) {
            num = num*10 + x%10;
            x /= 10;
        }
        return num==org;
    }
}