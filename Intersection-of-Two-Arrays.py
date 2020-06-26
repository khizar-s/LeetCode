class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        s = set(nums2)
        final = set()

        for x in nums1:
            if x in s:
                final.add(x)

        return final
