class Solution:
    def maxSubArray(self, nums):
        current_sum = 0
        best_sum = float('-inf')

        for value in nums:
            current_sum = max(value, current_sum + value)
            best_sum = max(best_sum, current_sum)

        return best_sum