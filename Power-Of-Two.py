class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        start = 1
        while (start < n):
            start *= 2
        return (start == n)
