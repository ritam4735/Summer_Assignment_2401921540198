class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length()) {
            return ans;
        }

        int[] need = new int[26];
        int[] window = new int[26];

        for (char c : p.toCharArray()) {
            need[c - 'a']++;
        }

        int k = p.length();

        for (int i = 0; i < k; i++) {
            window[s.charAt(i) - 'a']++;
        }

        if (matches(need, window)) {
            ans.add(0);
        }

        for (int i = k; i < s.length(); i++) {
            window[s.charAt(i) - 'a']++;
            window[s.charAt(i - k) - 'a']--;

            if (matches(need, window)) {
                ans.add(i - k + 1);
            }
        }

        return ans;
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}