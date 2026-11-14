class Solution:
    def maxArea(self, heights: List[int]) -> int:

        left = 0
        right = len(heights) - 1
        maximum_current = 0
        maximum_best = 0

        while left < right:
            maximum_current = (right - left) * min(heights[left], heights[right])

            if min(heights[left], heights[right]) == heights[left]:
                left += 1
            else:
                right -= 1

            if maximum_current > maximum_best:
                maximum_best = maximum_current

        return maximum_best


        