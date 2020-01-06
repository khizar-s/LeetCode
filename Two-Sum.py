class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        d = {}
        l = len(nums)
        for i in range(l):
            if (target - nums[i]) in d:
                print ([d[target - nums[i]], i])
                return [d[target - nums[i]], i]
            else:
                d[nums[i]] = i