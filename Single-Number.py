class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        dict = {}
        for x in nums:
            if x in dict.keys():
                dict.pop(x)
            else:
                dict[x] = 1
        for x in dict.keys():
            return x
