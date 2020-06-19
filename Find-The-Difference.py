class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        dict = {}

        for x in s:
            if x in dict:
                dict[x] += 1
            else:
                dict[x] = 1

        for y in t:
            if (y in dict and dict[y] == 0) or (y not in dict):
                return y
            else:
                dict[y] -= 1
