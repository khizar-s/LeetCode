class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        result = []
        for i in range(len(nums)):
            val = abs(nums[i]) - 1
            if (nums[val] > 0):
                nums[val] *= -1
            
        for j in range(len(nums)):
            if (nums[j] > 0):
                result.append(j + 1)
                
        return result