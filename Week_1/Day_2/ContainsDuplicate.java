class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> window = new HashSet<>();

        for (int num : nums) {
            if (window.contains(num)) {
                return true;
            }

            window.add(num);
        }

        return false;
    }
}