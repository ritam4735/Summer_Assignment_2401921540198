class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int bestSum = Integer.MIN_VALUE;

        for (int value : nums) {
            currentSum = Math.max(value, currentSum + value);
            bestSum = Math.max(bestSum, currentSum);
        }

        return bestSum;
    }
}