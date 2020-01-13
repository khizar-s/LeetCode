class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        
        d = {}
        left = 0
        right = 0
        max = 0
        
        while (right < len(s)):
            if s[right] not in d:
                d[s[right]] = s[right]
                right = right + 1
                if (right - left) > max:
                    max = right - left
            else:
                del d[s[left]]
                left = left + 1
        
        return max