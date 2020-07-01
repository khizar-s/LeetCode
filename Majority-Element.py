class Solution:
    def majorityElement(self, nums: List[int]) -> int:

        if len(nums) == 1:
            return nums[0]

        dict = {}

        for n in nums:
            if n in dict and dict[n] + 1 > len(nums)/2:
                return n
            elif n not in dict:
                dict[n] = 1
            else:
                dict[n] += 1
