class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        dict = {}
        for x in nums:
            if x in dict.keys():
                return True
            else:
                dict[x] = 1
        return False
