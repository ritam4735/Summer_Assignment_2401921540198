import java.util.*;

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();

        // Count frequency
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        // Find first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (freq.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}