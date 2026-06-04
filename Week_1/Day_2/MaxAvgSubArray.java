class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;

        // First window sum
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;
        int left = 0;

        // Slide the window
        for (int right = k; right < nums.length; right++) {
            windowSum += nums[right];   // add new element
            windowSum -= nums[left];    // remove old element
            left++;

            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;
    }
}