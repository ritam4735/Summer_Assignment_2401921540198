class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        # Sum of first window
        window_sum = sum(nums[:k])
        max_sum = window_sum

        # Slide the window
        left = 0
        for right in range(k, len(nums)):
            window_sum += nums[right]      # add new element
            window_sum -= nums[left]       # remove old element
            left += 1

            max_sum = max(max_sum, window_sum)

        return max_sum / k